package com.chrosciu.geometry;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
final class Triangle extends Polygon {
    final Point first;
    final Point second;
    final Point third;

    @Override
    List<Point> getVertices() {
        return null;
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs(
                ((second.x() - first.x()) * (third.y() - first.y())) - ((second.y() - first.y()) * (third.x() - first.x()))
        );
    }
}
