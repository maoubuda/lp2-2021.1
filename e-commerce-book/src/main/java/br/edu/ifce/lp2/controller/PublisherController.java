package br.edu.ifce.lp2.controller;

import br.edu.ifce.lp2.model.entities.Publisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PublisherController {


    @GetMapping
    public Publisher get() {

        var publisher = new Publisher();
        publisher.setId(1);
        publisher.setName("Elseiver");
        publisher.setPhone("(88) 9 9999 99 97");

        return publisher;
    }
}
