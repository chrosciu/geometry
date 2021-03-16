package com.chrosciu.geometry.model;

public sealed interface Shape permits Circle, Polygon {
    double getPerimeter();
    double getArea();
    Point getGravityCenter();
}
