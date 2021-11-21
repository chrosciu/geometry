package com.chrosciu.geometry.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public non-sealed class Rectangle implements Shape {
    @NonNull
    private final Point topLeft;
    private final double width;
    private final double height;

    @Override
    public double getArea() {
        return width * height;
    }
}
