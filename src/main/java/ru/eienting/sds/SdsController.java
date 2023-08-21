package ru.eienting.sds;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SdsController {


    @GetMapping("/mainpage")
    public String console() {
        return "mainpage";
    }

}