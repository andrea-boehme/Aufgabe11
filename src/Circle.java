public class Circle extends AbstractGeometricObject {
    private Point center;
    private double radius;


    /**
     * constructor method to define a circle object with given parameters
     * @param center point in the middle of the circle
     * @param radius radius of the circle
     */
    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }
    public double getRadius() {
        return radius;
    }


    /**
     * Methods to calculate circumference and area
     * @return circumference and area of shape
     */
    @Override
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI  * (Math. pow(radius, 2));
    }

    /**
     * toString method converts a string object into a string
     * @return: string representation of an object
     */
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}


