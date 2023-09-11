package org.tw.devbootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class RectangleTest {

    @Test
    void shouldReturnAreaOfRectangleWithNullLengthAndWidth(){
        Rectangle rectangle = new Rectangle(null, null);
        Double result = rectangle.area();
        assertNull(result);
    }

    @Test
    void shouldReturnAreaOfRectangleWithValidLengthAndWidth(){
        final double length = 10.0;
        final double width = 20.0;
        Rectangle rectangle = new Rectangle(length, width);
        Double result = rectangle.area();
        assertEquals(200.0, result);
    }

    @Test
    void shouldReturnPerimeterOfRectangleWithNullLengthAndWidth(){
        Rectangle rectangle = new Rectangle(null, null);
        Double result = rectangle.perimeter();
        assertNull(result);
    }

    @Test
    void shouldReturnPerimeterOfRectangleWithValidLengthAndWidth(){
        final double length = 10.0;
        final double width = 20.0;
        Rectangle rectangle = new Rectangle(length, width);
        Double result = rectangle.perimeter();
        assertEquals(60.0, result);
    }


}
