package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.CuentaBancaria;
import ec.edu.uce.domain.repository.CuentaBancariaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class CuentaBanacariaRepositoryImpl implements CuentaBancariaRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(CuentaBancaria cuenta) {
        this.em.persist(cuenta);

    }

    @Override
    public CuentaBancaria buscarPorId(Integer id) {

        return this.em.find(CuentaBancaria.class, id);
    }

    @Override
    public void actualizar(CuentaBancaria cuenta) {
        this.em.merge(cuenta);

    }

}
