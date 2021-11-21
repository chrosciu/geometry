package com.chrosciu.geometry.model;

import static com.chrosciu.geometry.model.Direction.HORIZONTAL;
import static com.chrosciu.geometry.model.Direction.VERTICAL;

public sealed interface Shape permits Circle, Rectangle, Square {
    double getArea();
    default Point getGravityCenter() {
        return switch (this) {
            case Circle c -> c.center();
            case Square s -> {
                var halfSize = s.size() / 2.0;
                yield s.topLeft().shift(halfSize, VERTICAL).shift(halfSize, HORIZONTAL);
            }
            case Rectangle r -> r.getTopLeft()
                    .shift(r.getWidth() / 2.0, HORIZONTAL)
                    .shift(r.getHeight() / 2.0, VERTICAL);
        };
    }
    default String getDescription() {
        return toString();
    }
}
