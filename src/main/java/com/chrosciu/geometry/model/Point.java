package com.chrosciu.geometry.model;

import lombok.NonNull;

record Point(double x, double y) {
    public Point shift(double distance, @NonNull Direction direction) {
        return switch (direction) {
            case HORIZONTAL -> new Point(x + distance, y);
            case VERTICAL -> new Point(x , y + distance);
        };
    }
}
