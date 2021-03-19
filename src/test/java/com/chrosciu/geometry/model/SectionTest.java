package com.chrosciu.geometry.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SectionTest {

    private Section section;

    @BeforeEach
    public void setup() {
        section = new Section(new Point(1, 2), new Point(3, 4));
    }

    @Test
    public void shouldNotBeEqualToNull() {
        assertNotEquals(null, section);
    }

    @Test
    public void shouldNotBeEqualToPureObject() {
        assertNotEquals(new Object(), section);
    }

    @Test
    public void shouldNotBeEqualToSectionWithDifferentPoints() {
        assertNotEquals(new Section(new Point(1, 2), new Point(3, 5)), section);
    }

    @Test
    public void shouldBeEqualToSectionWithSamePoints() {
        assertEquals(new Section(new Point(1, 2), new Point(3, 4)), section);
    }

    @Test
    public void shouldEqualToSectionWithSamePointsInReversedOrder() {
        assertEquals(new Section(new Point(3, 4), new Point(1, 2)), section);
    }

    @Test
    public void shouldReturnTheSameHashCodeIfPointsAreInReversedOrder() {
        assertEquals(new Section(new Point(3, 4), new Point(1, 2)).hashCode(), section.hashCode());
    }
}
