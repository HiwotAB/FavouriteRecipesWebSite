package hiwotab.favouriterecipeswebsite.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

// controller class is used as intermidate to our model  to the data base
@Controller
public class MainController {
    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
    @GetMapping("/")
    public String showCrabcake() {
        return "crabcakes";
    }
    @GetMapping("/")
    public String showGingeral() {
        return "gingerale";
    }
    @GetMapping("/")
    public String showCornbread() {
        return "cornbread";
    }

}
