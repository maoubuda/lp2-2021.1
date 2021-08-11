package lp2.ifce.edu.br;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class GetController {

    private Forca forca = new Forca("acabou");

    @GetMapping
    public Forca getForca(String letter) {
        forca.add(letter);
        return forca;
    }

}
