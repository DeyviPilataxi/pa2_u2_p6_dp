package ec.edu.uce.domain.repository;

import java.util.List;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Profesor;

public interface ProfesorRepository {

    public void crear(Profesor profesor);

    public Profesor seleccionarPorId(Integer id);

    public void actualizar(Profesor profesor);

    public void eliminar(Integer id);

    public List<Profesor> seleccionarPorNombreLike(String nombre);

    public List<Profesor> seleccionarConTelefonoRegistrado();

    public List<Profesor> seleccionarPorRangoId(Integer idInicio, Integer idFin);

    public List<Profesor> seleccionarPorNombre(String nombre);

    public List<Profesor> seleccionarPorDireccion(String direccion);

    public List<Profesor> seleccionarPorTelefono(String telefono);

    public Long contarProfesores();

    public List<Profesor> seleccionarProfesoresNative();

    public List<Profesor> seleccionarProfesoresPorNombreNative(String nombre);

    public List<Profesor> seleccionarProfesorPorDireccionNative(String direccion);

    public List<Profesor> seleccionarTodosCriteria();

    public List<Profesor> seleccionarPorNombreCriteria(String nombre);

    public List<Profesor> seleccionarDinamicoCriteria(String nombre, String telefono);

}
