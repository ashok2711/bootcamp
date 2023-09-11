package org.tw.devbootcamp;

import org.junit.jupiter.api.Test;
import org.tw.devbootcamp.exceptions.InvalidInputException;

import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {

    @Test
    void shouldReturnNullWithNullLengthAndWidthWhenAreaCalled(){
        assertThrows(InvalidInputException.class, () -> new Rectangle(null, null));
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
    void shouldReturnNullWithNullLengthAndWidthWhenPerimeterCalled(){

        assertThrows(InvalidInputException.class, () -> new Rectangle(null, null));

    }

    @Test
    void shouldReturnPerimeterOfRectangleWithValidLengthAndWidth(){
        final double length = 10.0;
        final double width = 20.0;
        Rectangle rectangle = new Rectangle(length, width);
        Double result = rectangle.perimeter();
        assertEquals(60.0, result);
    }

    @Test
    void shouldThrowExceptionWhenNegativeInputsInPerimeter(){
        final double length = -10.0;
        final double width = -20.0;
        assertThrows(InvalidInputException.class, () -> new Rectangle(length, width));
    }

}
