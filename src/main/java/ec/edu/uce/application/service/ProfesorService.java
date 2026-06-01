package ec.edu.uce.application.service;

import java.util.List;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProfesorService {

    @Inject
    private ProfesorRepository profesorRepository;

    public void guardar(Profesor profesor) {

        this.profesorRepository.crear(profesor);

    }

    public Profesor buscarPorId(Integer id) {
        return this.profesorRepository.seleccionarPorId(id);

    }

    public void eliminar(Integer idBuscado) {

        this.profesorRepository.eliminar(idBuscado);

    }

    public void actualizar(Profesor profesor) {
        this.profesorRepository.actualizar(profesor);
    }

    public List<Profesor> seleccionarPorNombreLike(String nombre) {
        return this.profesorRepository.seleccionarPorNombreLike(nombre);
    }

    public List<Profesor> seleccionarConTelefonoRegistrado() {
        return this.profesorRepository.seleccionarConTelefonoRegistrado();
    }

    public List<Profesor> seleccionarPorRangoId(Integer idInicio, Integer idFin) {
        return this.profesorRepository.seleccionarPorRangoId(idInicio, idFin);
    }

    public List<Profesor> seleccionarPorNombre(String nombre) {
        return this.profesorRepository.seleccionarPorNombre(nombre);
    }

    public List<Profesor> seleccionarPorDireccion(String direccion) {
        return this.profesorRepository.seleccionarPorDireccion(direccion);
    }

    public List<Profesor> seleccionarPorTelefono(String telefono) {
        return this.profesorRepository.seleccionarPorTelefono(telefono);
    }

    public Long contarProfesores() {
        return this.profesorRepository.contarProfesores();
    }

    // native query
    public List<Profesor> seleccionarProfesoresNative() {
        return this.profesorRepository.seleccionarProfesoresNative();
    }

    public List<Profesor> seleccionarProfesoresPorNombreNative(String nombre) {
        return this.profesorRepository.seleccionarProfesoresPorNombreNative(nombre);
    }

    public List<Profesor> seleccionarProfesorPorDireccionNative(String direccion) {
        return this.profesorRepository.seleccionarProfesorPorDireccionNative(direccion);
    }

}
