package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.model.Libro;
import ec.edu.uce.domain.repository.AuthorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class AuthorService {

    @Inject
    private AuthorRepository authorRepository;

    public void guardar(Autor autor) {
        this.authorRepository.crear(autor);

    }

    @Transactional
    public Autor consultarId(Integer id) {
        return this.authorRepository.consultarPorId(id);
    }

}
