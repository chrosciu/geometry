package com.chrosciu.geometry.model;

record Point(double x, double y) {
    double distance(Point p) {
        return Math.sqrt(Math.pow(p.x - x,2) + Math.pow(p.y - y, 2));
    }
}
