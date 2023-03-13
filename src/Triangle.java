public class Triangle implements GeometricObject {

    private Point topCenter;
    private Point bottomLeft;
    private Point bottomRight;

    public Triangle(Point topCenter, Point bottomLeft, Point bottomRight) {
        this.topCenter = topCenter;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public Point getTopCenter() {
        return topCenter;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    @Override
    public double calculateCircumference() {
        double sideOne = Math.sqrt(Math.pow((topCenter.getX()- bottomLeft.getX()), 2) + Math.pow((topCenter.getY()- bottomLeft.getY()), 2));
        double sideTwo = Math.sqrt(Math.pow((bottomRight.getX() - bottomLeft.getX()), 2) + Math.pow((bottomRight.getY() - bottomLeft.getY()), 2));
        double sideThree = Math.sqrt(Math.pow((bottomRight.getX() - topCenter.getX()), 2) + Math.pow((bottomRight.getY() - topCenter.getY()), 2));
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double calculateArea() {
        double sideOne = (topCenter.getX() * (bottomLeft.getY() - bottomRight.getY()));
        double sideTwo = (bottomLeft.getX() * (bottomRight.getY() - topCenter.getY()) );
        double sideThree = (bottomRight.getX() * (topCenter.getY() - bottomLeft.getY()) );
        return (sideOne + sideTwo + sideThree) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "topCenter=" + topCenter +
                ", bottomLeft=" + bottomLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
