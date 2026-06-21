package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.model.Libro;
import ec.edu.uce.domain.repository.LibroRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class LibroRepositoryImpl implements LibroRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Libro libro) {
        this.em.persist(libro);

    }

    @Override
    public Libro consultarPorId(Integer id) {

        return this.em.find(Libro.class, id);
    }

}
