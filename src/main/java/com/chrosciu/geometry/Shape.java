package com.chrosciu.geometry;

sealed interface Shape permits Circle, Polygon {
    double getPerimeter();
    double getArea();
}
