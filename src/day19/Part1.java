package day19;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Sneeuwpopsneeuw on 19-Dec-16.
 */
public class Part1 {

    public static void main(String[] args) { new Part1().start(3001330); }
    public void start(int input) {
        LinkedList<Integer> elves = new LinkedList<>();
        for (int i=1; i <= input; i++ )
            elves.addLast(i);

        boolean removeNext = false;
        while(elves.size() != 1) {
            Iterator<Integer> itr = elves.iterator();
            while(itr.hasNext()) {
                itr.next();
                if(removeNext) itr.remove();
                    removeNext = !removeNext;
            }
        }

        System.out.println( "" );
        System.out.println( elves.get(0) );   // 1808357
    }
}