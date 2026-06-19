package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Pais;
import ec.edu.uce.domain.repository.PaisRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PaisRepositoryImpl implements PaisRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Pais pais) {

        this.em.persist(pais);

    }

}
