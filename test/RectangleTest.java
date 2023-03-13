import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private final double DELTA = 0.01;

    Rectangle rectangle = new Rectangle(new Point(0,5), new Point(10,5), new Point(0,0), new Point(10,0));

    @Test
    void calculateCircumference() {
        assertEquals(rectangle.calculateCircumference(), 30.0, DELTA);
    }

    @Test
    void calculateArea() {
        assertEquals(rectangle.calculateArea(), 50.0, DELTA);
    }

}