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
        System.out.println("wallArea(10.0, 8.5, 9.0) = " + wallArea(10.0, 8.5, 9.0));
        System.out.println("wallArea(7.5, 11.5, 8.25) = " + wallArea(7.5, 11.5, 8.25));
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

    /**
     * wallArea - Returns the wall area given the room length, width, and height.
     * @param length - the room length as a double.
     * @param width - the room width as a double.
     * @param height - the room height as a double.
     * @return the wall area as a double.
     */
    public static double wallArea(double length, double width, double height) {
        return 2 * ( length + width) * height;
    }

}

