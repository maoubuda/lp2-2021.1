package br.ifce.core.observer;

import br.ifce.core.observer.pattern.Subject;

public class MessageSubject extends Subject {

    private String topic;
    private Message message;

    public MessageSubject(String topic) {
        this.topic = topic;
    }

    public void send(Message msg) {
        this.message = msg;
        this.notifyObservers();
    }

    public void notifyObservers() {
        for (var obs : observers) {
            obs.notify(message);
        }
    }

}
