public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(new Point(4, 8),  5);

        System.out.println(circle);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());



        Rectangle rectangle = new Rectangle(new Point(0,5), new Point(10,5), new Point(0,0), new Point(10,0));

        System.out.println(rectangle);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculateCircumference());


        Triangle triangle = new Triangle(new Point(3,6), new Point(2,4), new Point(7,8));

        System.out.println(triangle);
        System.out.println(triangle.calculateArea());
        System.out.println(triangle.calculateCircumference());

    }

}