package org.tw.devbootcamp;

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

    public Double perimeter() {
        if(null == length || null == width){
            return null;
        }
        return (length + width) * 2;
    }
}
