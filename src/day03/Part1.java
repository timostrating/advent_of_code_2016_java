package day03;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sneeuwpopsneeuw on 15-Dec-16.
 */
public class Part1 {
    public static void main(String[] args) throws IOException{ new Part1().start(); }
    public void start() throws IOException {
        File inFile = new File ("src/day03/input.txt");
        Scanner sc = new Scanner (inFile);
        triangle tri = new triangle(5, 10, 25);
        int output = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();

            Matcher m = Pattern.compile("\\d+").matcher(line);

            m.find();       // <-- this looks ugly I know
                tri.a = Integer.parseInt( m.group() );
            m.find();
                tri.b = Integer.parseInt( m.group() );
            m.find();
                tri.c = Integer.parseInt( m.group() );

            System.out.println( tri.a+" : "+tri.b+" : "+tri.c );
            output += (tri.isValid())? +1 : +0;
        }

        System.out.println(" ans = "+output);
    }

    class triangle {
        public int a, b, c;

        public triangle(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean isValid() {
            return (a+b > c && b+c > a && c+a > b);
        }
    }
}
