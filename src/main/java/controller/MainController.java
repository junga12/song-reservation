package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.Logger;

@Controller
public class MainController {

    Logger logger = Logger.getLogger(this.getClass().getSimpleName());

    @RequestMapping("/")
    public String test(Model model) {
        logger.info("test 컨트롤러");
        model.addAttribute("message", "Hello World");
        return "index";
    }
}
