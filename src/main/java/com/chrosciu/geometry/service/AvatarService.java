package com.chrosciu.geometry.service;

import org.springframework.stereotype.Service;

@Service
public class AvatarService {
    public String circleAvatar() {
        return """
            *  *
         *        *
        *          *
        *          *
         *        *
            *  *
        """;
    }

    public String triangleAvatar() {
        return """
            *
           * *
          *   *
         *     *
        *********
        """.indent(4);
    }

    public String sectionAvatar() {
        return """
            *
           *
          *
         *
        *
        """;
    }
}
