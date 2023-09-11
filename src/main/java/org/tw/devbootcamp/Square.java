package org.tw.devbootcamp;

import org.tw.devbootcamp.exceptions.InvalidInputException;

public class Square implements Shape {

    private final Double side;

    public Square(Double side) {
        if(null == side ){
            throw new InvalidInputException();
        }
        if( side<0.0){
            throw new InvalidInputException();
        }
        this.side=side;
    }

    @Override
    public Double area() {
        return side * side;
    }

    @Override
    public Double perimeter() {
        return 4* side ;
    }
}
