package com.makerpancho.basicweb.test1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/api/v1")
public class BoardController {

    @GetMapping("/list")
    public String list() {
        return "board/list";
    }
}
