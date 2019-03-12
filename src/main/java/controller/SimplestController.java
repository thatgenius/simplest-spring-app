package controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@ImportResource("classpath:/config.xml")
public class SimplestController {

    @Value("${value}")
    private String value;

    @RequestMapping(value = "/")
    public String list(ModelMap model) {
        model.addAttribute("firstVal", value);
        return "main";
    }
}
