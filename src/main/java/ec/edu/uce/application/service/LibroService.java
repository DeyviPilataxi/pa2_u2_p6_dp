package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.model.Libro;
import ec.edu.uce.domain.repository.LibroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class LibroService {

    @Inject
    private LibroRepository libroRepository;

    public void guardar(Libro libro) {
        this.libroRepository.crear(libro);

    }

    @Transactional
    public Libro consultarId(Integer id) {

        return this.libroRepository.consultarPorId(id);
    }

}
