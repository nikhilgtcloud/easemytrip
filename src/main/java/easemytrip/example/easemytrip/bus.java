package easemytrip.example.easemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class bus {
    @GetMapping("/bus")

    public String getData() {return  "Book your bus ticket on easemytrip" ; }
}
