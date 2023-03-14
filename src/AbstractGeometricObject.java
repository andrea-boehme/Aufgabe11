public abstract class AbstractGeometricObject {
    private double circumference;
    private double area;
    abstract double calculateCircumference();
    abstract double calculateArea();

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        calculateArea();
        return this.area;
    }

    public double getCircumference() {
        calculateCircumference();
        return this.circumference;
    }

}

