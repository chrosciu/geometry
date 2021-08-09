package com.chrosciu.geometry.model;

public sealed interface Shape permits Circle, Polygon {
    double getPerimeter();
    double getArea();
    Point getGravityCenter();
    default double getDiameter() {
        if (this instanceof Circle c) {
            return 2.0 * c.radius();
        } else if (this instanceof Section s) {
            return s.getPerimeter();
        } else if (this instanceof Triangle t) {
            double a = t.first.distance(t.second);
            double b = t.second.distance(t.third);
            double c = t.third.distance(t.first);
            return (a * b * c) / (2.0 * t.getArea());
        } else {
            throw new IllegalStateException("Should never happen");
        }
    }
}
