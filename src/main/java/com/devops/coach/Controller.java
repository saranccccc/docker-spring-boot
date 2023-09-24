package com.devops.coach;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/live")
    public String live(){
        return "live";
    }
    @GetMapping("/ready")
    public String ready(){
        return "ready";
    }
}
