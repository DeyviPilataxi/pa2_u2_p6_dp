package ec.edu.uce.application.service;

import java.time.LocalDate;

import ec.edu.uce.domain.model.Ciudadano;
import ec.edu.uce.domain.model.Empleado;
import ec.edu.uce.domain.repository.EmpleadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped

public class EmpleadoService {

    @Inject
    private EmpleadoRepository empleadoRepository;

    @Inject
    private CiudadanoService ciudadanoService;

    @Transactional
    public void guardar(Empleado empleado) {

        /*
         * Ciudadano ciudadano2 = new Ciudadano();
         * ciudadano2.setNombre("juanito");
         * LocalDate fechaNacimiento2 = LocalDate.of(1991, 5, 15);
         * ciudadano2.setFechaNacimiento(fechaNacimiento2);
         * this.ciudadanoService.guardar(ciudadano2);
         * empleado.setCiudadano(ciudadano2);
         */
        this.empleadoRepository.crear(empleado);

    }

}
