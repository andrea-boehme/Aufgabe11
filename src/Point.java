public class Point {

    // define attributes (two dimensions)
    private double x;
    private double y;

    /**
     * constructor method to define a point object at a specific x,y location (instead of setter method)
     * @param x x-coordinate
     * @param y y-coordinate
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getter method to get value of x
     * @return value of x
     */
    public double getX() {
        return x;
    };

    /**
     * getter method to get value of y
     * @return value of y
     */
    public double getY() {
        return y;
    };

    /**
     * toString method converts a string object into a string
     * @return: string representation of an object
     */
    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
