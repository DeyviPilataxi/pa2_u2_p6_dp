package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Pasaporte;
import ec.edu.uce.domain.repository.PasaporteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class PasaporteRepositoryImpl implements PasaporteRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Pasaporte pasaporte) {

        this.em.persist(pasaporte);

    }
}
