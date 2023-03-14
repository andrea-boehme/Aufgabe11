import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends GeometricObjectTest {

    private final double DELTA = 0.01;

    Triangle triangle = new Triangle(new Point(3,6), new Point(2,4), new Point(7,8));

    @Test
    public void calculateCircumference() {
        assertEquals(triangle.calculateCircumference(), 13.111328, DELTA);
    }

    @Test
    public void calculateArea() {
        assertEquals(triangle.calculateArea(), 3.0, DELTA);
    }
}