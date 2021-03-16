package com.chrosciu.geometry;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
final class Section extends Polygon {
    final Point start;
    final Point end;

    @Override
    List<Point> getVertices() {
        return Arrays.asList(start, end);
    }

    @Override
    public double getArea() {
        return 0;
    }
}
