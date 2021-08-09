package com.chrosciu.geometry.web;

import com.chrosciu.geometry.service.AvatarService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avatar")
@RequiredArgsConstructor
public class AvatarController {
    private final AvatarService avatarService;

    @GetMapping("/circle")
    public String circleAvatar() {
        return avatarService.circleAvatar();
    }
    @GetMapping("/triangle")
    public String triangleAvatar() {
        return avatarService.triangleAvatar();
    }
    @GetMapping("/section")
    public String sectionAvatar() {
        return avatarService.sectionAvatar();
    }
}
