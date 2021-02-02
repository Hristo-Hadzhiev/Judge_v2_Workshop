package work.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeworkController {

    @GetMapping("/homework-check")
    public String getCheckHomework(){
        return "/homework-check";
    }
}
