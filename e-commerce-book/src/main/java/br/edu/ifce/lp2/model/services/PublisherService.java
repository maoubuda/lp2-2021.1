package br.edu.ifce.lp2.model.services;

import br.edu.ifce.lp2.model.entities.Publisher;
import br.edu.ifce.lp2.model.repository.PublisherRepository;

import java.util.Collection;

public class PublisherService {

    private static PublisherRepository repository = new PublisherRepository();

    public void create(Publisher publisher) {

        if (!isExists(publisher)) {
            repository.create(publisher);
        }

    }

    public void update(Long id, Publisher publisher) {

        var canUpdate = this.getById(id) != null;

        if (canUpdate) {

            if (!isExists(publisher)) {
                repository.update(id, publisher);
            }

        }

    }

    private boolean isExists(Publisher publisher) {
        return repository
                .getAll()
                .stream()
                .anyMatch(p -> p.getName().toLowerCase().trim().equals(publisher.getName().toLowerCase().trim()));
    }

    public Collection<Publisher> getAll() {
        return repository.getAll();
    }

    public Publisher getById(Long id) {
        return repository.getById(id);
    }

    public void delete(Long id) {
        repository.delete(id);
    }
}
