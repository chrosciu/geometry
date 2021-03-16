package com.chrosciu.geometry.model;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

abstract sealed class Polygon implements Shape permits Section, Triangle {
    abstract List<Point> getVertices();

    @Override
    public double getPerimeter() {
        List<Point> vertices = getVertices();
        int verticesCount = vertices.size();
        return IntStream.range(0, verticesCount)
                .mapToDouble(index -> vertices.get(index).distance(vertices.get((index + 1) % verticesCount)))
                .reduce(0, Double::sum);
    }

    @Override
    public Point getGravityCenter() {
        return getVertices().stream().collect(Collectors.teeing(
                Collectors.averagingDouble(Point::x),
                Collectors.averagingDouble(Point::y),
                Point::new
        ));
    }
}
