package org.tw.devbootcamp;

import org.tw.devbootcamp.exceptions.InvalidInputException;

public class Rectangle implements Shape {


    private final Double length;

    private final Double width;

    public Rectangle(Double length, Double width) {
        if(null == length || null == width){
            throw new InvalidInputException();
        }
        if( length<0.0 ||  width<0.0){
            throw new InvalidInputException();
        }
        this.length = length;
        this.width = width;
    }


    @Override
    public Double area() {

        return length * width;
    }

    @Override
    public Double perimeter() throws InvalidInputException {


        return (length + width) * 2;
    }
}
