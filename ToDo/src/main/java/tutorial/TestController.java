package tutorial;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by kennypunja on 2/8/17.
 */

@Controller
public class TestController {


    @RequestMapping(value="/main", method=RequestMethod.GET)
    public String test(){
        return "mainPage";
    }

    @RequestMapping(value="/",method= RequestMethod.GET)
    public String norm(){
        return "view";
    }
}