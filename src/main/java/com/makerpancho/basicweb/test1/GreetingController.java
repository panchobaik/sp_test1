package com.makerpancho.basicweb.test1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping(path = "/api/v1")
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(@RequestParam(name="name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        System.out.println("class GreetingController:greeting");
        System.out.println(model);
        return "greeting";
    }

    @GetMapping("index")
    public String index() {
        return "index";
    }
}
