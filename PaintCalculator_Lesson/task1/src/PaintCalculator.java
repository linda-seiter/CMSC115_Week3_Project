/**
 * PaintCalculator class calculates the gallons of paint
 * needed to cover the ceiling and walls of a rectangular room.
 * @author First Last
 */
public class PaintCalculator {

    /**
     * main - Task method calls
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("ceilingArea(12.0, 15.0) = " + ceilingArea(12.0, 15.0));
        System.out.println("ceilingArea(7.5, 11.5) = " + ceilingArea(7.5, 11.5));
    }

    /**
     * ceilingArea - Returns the ceiling area given the room length and width.
     * @param length - the room length as a double.
     * @param width - the room width as a double.
     * @return the ceiling area as a double.
     */
    public static double ceilingArea(double length, double width) {
        return length * width;
    }

}


