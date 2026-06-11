package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Ciudadano;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CiudadanoRepositoryImpl {

    @Inject
    private EntityManager em;

    public void crear(Ciudadano ciudadano) {
        this.em.persist(ciudadano);

    }

}
