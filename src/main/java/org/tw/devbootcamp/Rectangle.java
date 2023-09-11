package org.tw.devbootcamp;

public class Rectangle {


    public Double area(Double length, Double width) {
        if(null == length || null == width){
            return null;
        }
        return length * width;
    }
}
