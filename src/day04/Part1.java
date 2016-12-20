package day04;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Sneeuwpopsneeuw on 15-Dec-16.
 */
public class Part1 {
    public static void main(String[] args) throws IOException{ new Part1().start(); }
    public void start() throws IOException {
        File inFile = new File ("src/day04/input.txt");
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





/*

Finally, you come across an information kiosk with a list of rooms. Of course, the list is encrypted and full of decoy data,
but the instructions to decode the list are barely hidden nearby. Better remove the decoy data first.

Each room consists of an encrypted name (lowercase letters separated by dashes) followed by a dash, a sector ID, and a checksum in square brackets.

A room is real (not a decoy) if the checksum is the five most common letters in the encrypted name, in order, with ties broken by alphabetization. For example:

aaaaa-bbb-z-y-x-123[abxyz] is a real room because the most common letters are a (5), b (3), and then a tie between x, y, and z, which are listed alphabetically.
a-b-c-d-e-f-g-h-987[abcde] is a real room because although the letters are all tied (1 of each), the first five are listed alphabetically.
not-a-real-room-404[oarel] is a real room.
totally-real-room-200[decoy] is not.
Of the real rooms from the list above, the sum of their sector IDs is 1514.

What is the sum of the sector IDs of the real rooms?

 */