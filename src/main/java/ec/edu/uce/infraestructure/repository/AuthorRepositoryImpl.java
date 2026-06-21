package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Autor;
import ec.edu.uce.domain.model.Libro;
import ec.edu.uce.domain.repository.AuthorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class AuthorRepositoryImpl implements AuthorRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Autor autor) {
        this.em.persist(autor);

    }

    @Override
    public Autor consultarPorId(Integer id) {

        return this.em.find(Autor.class, id);
    }

}
