package com.oyk.level01.basic;

public class Rectangle extends Shape implements Resizable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        this.width *= factor;
        this.height *= factor;
    }

    @Override
    double calculateArea() {
        return width * height;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Shape: Rectangle\nArea: " + calculateArea() + "\nPerimeter: " + calculatePerimeter();
    }
}
