package com.chrosciu.geometry.model;

import lombok.NonNull;

public record Square(@NonNull Point topLeft, double size) implements Shape {
    public Square {
        if (size < 0) {
            throw new IllegalArgumentException("Negative size is not allowed !");
        }
    }

    @Override
    public double getArea() {
        return size * size;
    }
}
