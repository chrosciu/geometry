package com.chrosciu.geometry.web;

import com.chrosciu.geometry.model.Circle;
import com.chrosciu.geometry.model.Shape;
import com.chrosciu.geometry.model.Square;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShapeController {
    @PostMapping("/circle")
    public Shape circle(@RequestBody Circle circle) {
        return circle;
    }

    @PostMapping("/square")
    public Shape triangle(@RequestBody Square square) {
        return square;
    }
}
