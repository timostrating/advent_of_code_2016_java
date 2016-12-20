package day01;

/**
 * Created by Sneeuwpopsneeuw on 13-Dec-16.
 */
public class Part1 {
    enum Direction { NORTH, EAST, SOUTH, WEST };
    Direction direction = Direction.NORTH;
    int x, y;


    public static void main(String[] args) { new Part1().start("R3, L5, R2, L2, R1, L3, R1, R3, L4, R3, L1, L1, R1, L3, R2, L3, L2, R1, R1, L1, R4, L1, L4, R3, L2, L2, R1, L1, R5, R4, R2, L5, L2, R5, R5, L2, R3, R1, R1, L3, R1, L4, L4, L190, L5, L2, R4, L5, R4, R5, L4, R1, R2, L5, R50, L2, R1, R73, R1, L2, R191, R2, L4, R1, L5, L5, R5, L3, L5, L4, R4, R5, L4, R4, R4, R5, L2, L5, R3, L4, L4, L5, R2, R2, R2, R4, L3, R4, R5, L3, R5, L2, R3, L1, R2, R2, L3, L1, R5, L3, L5, R2, R4, R1, L1, L5, R3, R2, L3, L4, L5, L1, R3, L5, L2, R2, L3, L4, L1, R1, R4, R2, R2, R4, R2, R2, L3, L3, L4, R4, L4, L4, R1, L4, L4, R1, L2, R5, R2, R3, R3, L2, L5, R3, L3, R5, L2, R3, R2, L4, L3, L1, R2, L2, L3, L5, R3, L1, L3, L4, L3"); }
    public void start(String input) {

        if (input.contains(",")) {
            runCommand( input.substring( 0, input.indexOf(',')) );
            start(input.substring(input.indexOf(',') + 2, input.length()));
        }
        else {
            runCommand( input.substring( 0, input.length()) );
            System.out.print( x + " " + y +"  :  "+ (Math.abs(x)+Math.abs(y)));
        }
    }

    public void runCommand(String str) {
        runCommand(str.charAt(0), Integer.parseInt(str.substring(1, str.length())));
    }

    public void runCommand(char rotationChar, int steps) {
        direction = nextDirection( (rotationChar == 'R') );  // We assume we have 2 categories R and everything else;

        switch (direction) {
            case NORTH: y += steps; break;
            case EAST:  x += steps; break;
            case SOUTH: y -= steps; break;
            case WEST:  x -= steps; break;
        }
    }

    public Direction nextDirection( boolean isClockwise) {
        int index = direction.ordinal();
        index += (isClockwise)?  +1  :  -1;

        if (index < 0)
            index = 3;
        else if (index > 3)
            index = 0;

        return Direction.values()[index];
    }
}
