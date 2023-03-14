/**
 * main method creates circle/rectangle/triangle with given parameters,
 * calls area and circumference calculation methods specified in each shape class,
 * prints out the result
 */
public class Main {
    public static void main(String[] args) {

        System.out.println();

        Circle circle = new Circle(new Point(4, 8),  5);

        System.out.println(circle);
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());
        System.out.println();


        Rectangle rectangle = new Rectangle(new Point(0,5), new Point(10,5), new Point(0,0), new Point(10,0));

        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculateCircumference());
        System.out.println();


        Triangle triangle = new Triangle(new Point(3,6), new Point(2,4), new Point(7,8));

        System.out.println(triangle);
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println("Perimeter: " + triangle.calculateCircumference());

    }

}