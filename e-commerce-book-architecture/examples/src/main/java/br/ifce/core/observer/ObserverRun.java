package br.ifce.core.observer;

public class ObserverRun {

    public static void main(String[] args) {
        var sub1 = new MessageSubject("LP2 201.1");

        var m1 = new Member();
        m1.setName("Eolo");

        var m2 = new Member();
        m2.setName("Cassandra");

        var m3 = new Member();
        m3.setName("Marlilson");

        sub1.subscribe(m1);
        sub1.subscribe(m3);
        sub1.subscribe(m2);

        sub1.send(new Message("Hello", m3));

        sub1.cancel(m2);

        sub1.send(new Message("Tudo em Paz?", m1));

    }


}
