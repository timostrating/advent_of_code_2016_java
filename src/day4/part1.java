package day4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Sneeuwpopsneeuw on 15-Dec-16.
 */
public class part1 {
    public static void main(String[] args) throws IOException{ new part1().start(); }
    public void start() throws IOException {
        File inFile = new File ("src/day4/input.txt");
        Scanner sc = new Scanner (inFile);

        while (sc.hasNext()) {
            String line = sc.nextLine();

            System.out.print( line.substring(0, (line.indexOf('[')-3) ) +"  :  ");
            System.out.print( line.substring((line.indexOf('[')-3), line.indexOf('[') ) +"  :  ");
            System.out.println( line.substring(line.indexOf('['), line.length() ));
        }

        System.out.println(" ans = ");
    }
}
