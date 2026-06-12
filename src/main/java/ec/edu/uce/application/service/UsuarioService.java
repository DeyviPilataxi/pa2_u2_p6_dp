package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Usuario;
import ec.edu.uce.domain.repository.UsuarioRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UsuarioService {

    @Inject
    private UsuarioRepository usuarioRepository;

    public void guardar(Usuario usuario) {
        this.usuarioRepository.crear(usuario);
    }

}
