package pl.school.languageschool.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
    public SecurityController(){};

    @GetMapping("/403")
    public String accesDenided(){
        return "/accesdenided";
    }


}
