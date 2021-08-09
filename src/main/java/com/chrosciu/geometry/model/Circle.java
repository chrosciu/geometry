package com.chrosciu.geometry.model;

import lombok.NonNull;

public final record Circle(@NonNull Point center, double radius) implements Shape {

    public Circle {
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

    @Override
    public Point getGravityCenter() {
        return center;
    }

}
