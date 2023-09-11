package org.tw.devbootcamp;

import org.junit.jupiter.api.Test;
import org.tw.devbootcamp.exceptions.InvalidInputException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SquareTest {
    @Test
    void shouldReturnNullWithNullSideWhenAreaCalled(){
        assertThrows(InvalidInputException.class, () -> new Square(null));
    }

    @Test
    void shouldReturnAreaOfSquareWithValidSide(){
        final double side = 10.0;
        Shape square = new Square(side);
        Double result = square.area();
        assertEquals(100.0, result);
    }

    @Test
    void shouldReturnNullWithNullLengthAndWidthWhenPerimeterCalled(){

        assertThrows(InvalidInputException.class, () -> new Square(null));

    }

    @Test
    void shouldReturnPerimeterOfSquareWithValidSide(){

        final double side = 10.0;
        Shape square = new Square(side);
        Double result = square.perimeter();
        assertEquals(40.0, result);
    }

    @Test
    void shouldThrowExceptionWhenNegativeInputsInPerimeter(){
        final double side = -10.0;
        assertThrows(InvalidInputException.class, () -> new Square(side));
    }

}
