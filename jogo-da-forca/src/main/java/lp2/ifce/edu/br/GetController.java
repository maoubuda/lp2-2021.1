package lp2.ifce.edu.br;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class GetController {

    @GetMapping("h1")
    public String teste() {
        return "Hello World";
    }

    @GetMapping("h2")
    public String teste2() {
        return "Hello World 2";
    }

}
