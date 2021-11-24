package br.ifce.core.observer;

import br.ifce.core.observer.pattern.Observer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member implements Observer {

    private String name;

    @Override
    public void notify(Message message) {
        if (!message.sender().getName().equals(name)) {
            System.out.println(message.sender().getName() + " ------> " + name);
            System.out.println(message.text());
        }
    }
}
