package com.chrosciu.geometry.model;


public final record Circle(Point center, double radius) implements Shape {
    private static int instancesCount = 0;

    public Circle {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius is not allowed");
        }
        if (null == center) {
            center = new Point(0, 0);
        }
        ++instancesCount;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public int getInstancesCount() {
        return instancesCount;
    }
}
