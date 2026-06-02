package ec.edu.uce.domain.repository;

import java.time.LocalDate;
import java.util.List;

import ec.edu.uce.domain.model.Estudiante;

public interface EstudianteRepository {

    public void crear(Estudiante estudiante);

    public Estudiante seleccionarPorId(Integer id);

    public void actualizar(Estudiante estudiante);

    public void eliminar(Integer id);

    public List<Estudiante> seleccionarTodos();

    public List<Estudiante> seleccionarPorNombre(String nombre);

    public Estudiante seleccionarPorCedula(String cedula);

    public List<Estudiante> seleccionarPorGenero(String genero);

    public List<Estudiante> seleccionarPorGeneroTyped(String genero);

    public List<Estudiante> seleccionarPorRangosFechas(LocalDate fechaInicio, LocalDate fechaFin);

    public Long SeleccionarContar();

    public List<Estudiante> seleccionarTodosNative();

    public List<Estudiante> seleccionarTodosCriteria();

    public List<Estudiante> seleccionarPorNombreCriteria(String nombre);

    public List<Estudiante> seleccionarDinamicoCriteria(String nombre, String apellido);
}
