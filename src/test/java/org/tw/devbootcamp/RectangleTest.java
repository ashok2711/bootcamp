package org.tw.devbootcamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class RectangleTest {

    @Test
    void shouldReturnAreaOfRectangleWithNullLengthAndWidth(){
        Rectangle rectangle = new Rectangle();
        Double result = rectangle.area(null, null);
        assertNull(result);
    }

    @Test
    void shouldReturnAreaOfRectangleWithValidLengthAndWidth(){
        Rectangle rectangle = new Rectangle();
        Double result = rectangle.area(10.0, 20.0);
        assertEquals(200.0, result);
    }
}
