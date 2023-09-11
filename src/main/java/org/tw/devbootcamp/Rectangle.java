package org.tw.devbootcamp;

import org.tw.devbootcamp.exceptions.NegativeInputException;

public class Rectangle {


    private final Double length;

    private final Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }


    public Double area() {
        if(null == length || null == width){
            return null;
        }
        return length * width;
    }

    public Double perimeter() throws NegativeInputException {
        if(null == length || null == width){
            return null;
        }
        if( length<0.0 ||  width<0.0){
            throw new NegativeInputException();
        }
        return (length + width) * 2;
    }
}
