package com.chrosciu.geometry.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
public final class Section extends Polygon {
    @NonNull
    final Point start;
    @NonNull
    final Point end;

    @Override
    List<Point> getVertices() {
        return Arrays.asList(start, end);
    }

    @Override
    public double getArea() {
        return 0;
    }

    public static String getAvatar() {
        return """
            *
           *
          *   \
         * \s
        *
        """;
    }
}
