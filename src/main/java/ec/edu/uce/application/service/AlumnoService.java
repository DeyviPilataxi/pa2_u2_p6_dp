package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Alumno;
import ec.edu.uce.domain.repository.AlumnoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AlumnoService {

    @Inject
    private AlumnoRepository alumnoRepository;

    public void guardar(Alumno alumno) {

        this.alumnoRepository.crear(alumno);

    }

    // public Alumno consultarId(Integer id) {

    // return this.alumnoRepository(this.consultarId(id));

    // }

}
