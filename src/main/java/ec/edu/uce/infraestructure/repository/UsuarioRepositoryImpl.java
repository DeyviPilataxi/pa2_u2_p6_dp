package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Usuario;
import ec.edu.uce.domain.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class UsuarioRepositoryImpl implements UsuarioRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Usuario usuario) {
        this.em.persist(usuario);

    }

}
