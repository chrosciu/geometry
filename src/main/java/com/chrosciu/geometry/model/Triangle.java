package com.chrosciu.geometry.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public final class Triangle extends Polygon {
    @NonNull
    final Point first;
    @NonNull
    final Point second;
    @NonNull
    final Point third;

    @Override
    List<Point> getVertices() {
        return Arrays.asList(first, second, third);
    }

    @Override
    public double getArea() {
        return 0.5 * Math.abs(
                ((second.x() - first.x()) * (third.y() - first.y())) - ((second.y() - first.y()) * (third.x() - first.x()))
        );
    }
}
