import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private final double DELTA = 0.01;

    Circle circle = new Circle(new Point(4, 8), 5);

    @Test
    void calculateCircumference() {
        assertEquals(circle.calculateCircumference(), 31.41592653589793, DELTA);
    }

    @Test
    void calculateArea() {
        assertEquals(circle.calculateArea(), 78.53981633974483, DELTA);
    }
}