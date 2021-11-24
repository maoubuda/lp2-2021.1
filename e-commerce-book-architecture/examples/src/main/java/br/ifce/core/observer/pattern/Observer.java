package br.ifce.core.observer.pattern;

import br.ifce.core.observer.Message;

public interface Observer {

    void notify(Message message);

}
