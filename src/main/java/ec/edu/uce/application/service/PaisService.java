package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Pais;
import ec.edu.uce.domain.repository.PaisRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PaisService {

    @Inject
    private PaisRepository paisRepository;

    public void guardar(Pais pais) {

        this.paisRepository.crear(pais);

    }

}
