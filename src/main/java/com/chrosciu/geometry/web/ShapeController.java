package com.chrosciu.geometry.web;

import com.chrosciu.geometry.model.Circle;
import com.chrosciu.geometry.model.Section;
import com.chrosciu.geometry.model.Shape;
import com.chrosciu.geometry.model.Triangle;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ShapeController {
    @PostMapping("circle")
    public Shape circle(@RequestBody Circle circle) {
        return circle;
    }
    @GetMapping("circle")
    public String circleAvatar() {
        return Circle.getAvatar();
    }

    @PostMapping("triangle")
    public Shape triangle(@RequestBody Triangle triangle) {
        return triangle;
    }
    @GetMapping("triangle")
    public String triangleAvatar() {
        return Triangle.getAvatar();
    }

    @PostMapping("section")
    public Shape section(@RequestBody Section section) {
        return section;
    }
    @GetMapping("section")
    public String sectionAvatar() {
        return Section.getAvatar();
    }
}
