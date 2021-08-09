package com.chrosciu.geometry.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
@ToString
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

    @Override
    public boolean equals(Object anotherObject) {
        if (anotherObject instanceof Section anotherSection) {
            return (this.start.equals(anotherSection.getStart())
                    && this.end.equals(anotherSection.getEnd()))
                    || (this.start.equals(anotherSection.getEnd())
                    && this.end.equals(anotherSection.getStart()));
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.start.hashCode() + this.end.hashCode();
    }
}
