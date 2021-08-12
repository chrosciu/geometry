package com.chrosciu.geometry.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/banner")
public class BannerController {

    @GetMapping()
    public String banner() {
        return """
                <html>
                  <body>
                     <div style="border: 1px dotted;min-height: 50px; align-items: center;
                        justify-content: center; display: flex;">
                        GEOMETRY APPLICATION
                     </div>
                  </body>
                </html>
        """;
    }
}
