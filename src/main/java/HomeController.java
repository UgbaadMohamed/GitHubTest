import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String index () {
        return "Hello world!";

    }

    // kommentar
    //hh

    //git

    // med ikhra og munuira

    // den nyeste 
}
