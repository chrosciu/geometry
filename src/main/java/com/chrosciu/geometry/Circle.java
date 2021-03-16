package com.chrosciu.geometry;

record Circle(Point center, double radius) implements Shape {

    Circle {
       if (radius < 0) {
          throw new IllegalArgumentException("Negative radius is not allowed");
       }
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
