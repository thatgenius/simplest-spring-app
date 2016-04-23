package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class SimplestController {

    @RequestMapping(value = "/")
    public String list(ModelMap model) {
        model.addAttribute("firstVal", "pretty simple");
        return "main";
    }
}
