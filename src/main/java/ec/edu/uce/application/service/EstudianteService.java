package ec.edu.uce.application.service;

import java.time.LocalDate;
import java.util.List;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.repository.EstudianteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class EstudianteService {

    @Inject
    private EstudianteRepository estudianteRepository;

    public void guardar(Estudiante estudiante) {

        this.estudianteRepository.crear(estudiante);

    }

    public Estudiante buscarPorId(Integer id) {
        return this.estudianteRepository.seleccionarPorId(id);

    }

    public void eliminar(Integer idBuscado) {

        this.estudianteRepository.eliminar(idBuscado);

    }

    public void actualizar(Estudiante estudiante) {
        this.estudianteRepository.actualizar(estudiante);
    }

    public List<Estudiante> seleccionarTodos() {
        return this.estudianteRepository.seleccionarTodos();

    }

    public List<Estudiante> seleccionarPorNombre(String nombre) {
        return this.estudianteRepository.seleccionarPorNombre(nombre);
    }

    public Estudiante seleccionarPorCedula(String cedula) {
        return this.estudianteRepository.seleccionarPorCedula(cedula);
    }

    public List<Estudiante> seleccionarPorGenero(String genero) {
        return this.estudianteRepository.seleccionarPorGenero(genero);
    }

    public List<Estudiante> seleccionarPorGeneroTyped(String genero) {
        return this.estudianteRepository.seleccionarPorGeneroTyped(genero);
    }

    public List<Estudiante> seleccionarPorRangosFechas(LocalDate fechaInicio, LocalDate fechaFin) {
        return this.estudianteRepository.seleccionarPorRangosFechas(fechaInicio, fechaFin);
    }

    public Long seleccionarContar() {
        return this.estudianteRepository.SeleccionarContar();
    }

}
