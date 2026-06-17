package ec.edu.uce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.application.service.CiudadanoService;
import ec.edu.uce.application.service.EmpleadoService;
import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.application.service.PasaporteService;
import ec.edu.uce.application.service.ProfesorService;
import ec.edu.uce.application.service.UsuarioService;
import ec.edu.uce.domain.model.Ciudadano;
import ec.edu.uce.domain.model.Empleado;
import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Pasaporte;
import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.model.Usuario;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {

    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    @ApplicationScoped
    public static class App implements QuarkusApplication {

        // @Inject
        // private EstudianteService estudianteService;
        // @Inject
        // private ProfesorService profesorService;

        // @Inject
        // private CiudadanoService ciudadanoService;

        @Inject
        private UsuarioService usuarioService;

        @Inject
        private PasaporteService pasaporteService;

        // @Inject
        // private EmpleadoService empleadoService;

        @Override

        public int run(String... args) {

            /*
             * System.out.println("conexion a base de datos");
             * 
             * Estudiante est = new Estudiante();
             * est.setNombre("joel");
             * est.setApellido("guaina");
             * est.setFechaNacimiento(LocalDate.of(2000, 06, 21));
             * est.setGenero("M");
             * this.estudianteService.guardar(est);
             * 
             * this.estudianteService.buscarPorId(2);
             * 
             * 
             * if (est != null) {
             * System.out.println("Estudiante encontrado con éxito:");
             * System.out.println("Nombre: " + est.getNombre());
             * System.out.println("Apellido: " + est.getApellido());
             * System.out.println("Género: " + est.getGenero());
             * } else {
             * System.out.println("No se encontró ningún estudiante ");
             * 
             * }
             * 
             * System.out.println("Actualizar");
             * 
             * Estudiante est1 = this.estudianteService.buscarPorId(1);
             * 
             * if (est1 != null) {
             * 
             * est1.setApellido("estudiante Cambiado");
             * 
             * this.estudianteService.actualizar(est1);
             * System.out.println("Apellido actualizado con éxito.");
             * } else {
             * System.out.println("No se encontró el estudiante para actualizar.");
             * }
             * 
             * this.estudianteService.eliminar(1);
             * System.out.println("estudiante eliminado");
             */

            /*
             * Profesor prof = new Profesor();
             * prof.setNombre("Julian");
             * prof.setApellido("Alvarez");
             * prof.setFechaNacimiento(LocalDate.of(2001, 07, 12));
             * prof.setGenero("M");
             * this.profesorService.guardar(prof);
             * 
             * Profesor prof1 = new Profesor();
             * prof1.setNombre("Enrique");
             * prof1.setApellido("Kaviedes");
             * prof1.setFechaNacimiento(LocalDate.of(1998, 03, 06));
             * prof1.setGenero("M");
             * this.profesorService.guardar(prof1);
             * 
             * this.profesorService.buscarPorId(1);
             * 
             * if (prof != null) {
             * System.out.println("Profesor encontrado con éxito:");
             * System.out.println("Nombre: " + prof.getNombre());
             * System.out.println("Apellido: " + prof.getApellido());
             * System.out.println("Género: " + prof.getGenero());
             * } else {
             * System.out.println("No se encontró ningún profesor ");
             * 
             * }
             * 
             * System.out.println("Actualizar");
             * 
             * Profesor prof2 = this.profesorService.buscarPorId(1);
             * 
             * if (prof2 != null) {
             * 
             * prof2.setApellido("profesor Cambiado");
             * 
             * this.profesorService.actualizar(prof2);
             * System.out.println("Apellido actualizado con éxito.");
             * } else {
             * System.out.println("No se encontró el profesor para actualizar.");
             * }
             * 
             * this.profesorService.eliminar(2);
             * System.out.println("profesor eliminado");
             */

            /*
             * List<Estudiante> estudiantes = this.estudianteService.seleccionarTodos();
             * System.out.println("Lista de estudiantes:");
             * if (estudiantes != null && !estudiantes.isEmpty()) {
             * for (Estudiante estudiante : estudiantes) {
             * System.out.println("Nombre: " + estudiante.getNombre() + ", Apellido: " +
             * estudiante.getApellido());
             * }
             * } else {
             * System.out.println("No hay estudiantes registrados.");
             * }
             */

            /*
             * List<Estudiante> estudiantes = this.estudianteService.seleccionarTodos();
             * System.out.println("Lista de estudiantes:");
             * for (Estudiante est : estudiantes) {
             * System.out.println("- " + est.getNombre() + " " + est.getApellido());
             * }
             */

            /*
             * List<Estudiante> estudiantesPorNombre =
             * this.estudianteService.seleccionarPorNombre("Deyvi");
             * System.out.println("Estudiantes con el nombre 'Deyvi':");
             * for (Estudiante est : estudiantesPorNombre) {
             * System.out.println(est);
             * }
             */
            /*
             * List<Estudiante> estudiantesPorNombre =
             * this.estudianteService.seleccionarPorNombre("deyvi");
             * System.out.println("Estudiantes con el nombre 'deyvi':");
             * for (Estudiante est : estudiantesPorNombre) {
             * System.out.println(est);
             * }
             * 
             * Estudiante estudiantePorCedula =
             * this.estudianteService.seleccionarPorCedula("1234567890");
             * if (estudiantePorCedula != null) {
             * System.out.println("Estudiante encontrado con cédula :");
             * System.out.println(est);
             * } else {
             * System.out.
             * println("No se encontró ningún estudiante con la cédula '1723456789'.");
             * }
             * 
             */

            /*
             * String nombreBuscar = "ma";
             * List<Profesor> profesoresPorNombre =
             * this.profesorService.seleccionarPorNombreLike(nombreBuscar);
             * System.out.println("\nProfesores que coinciden con '" + nombreBuscar +
             * "' (LIKE):");
             * for (Profesor prof : profesoresPorNombre) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> profesoresConTelefono =
             * this.profesorService.seleccionarConTelefonoRegistrado();
             * System.out.println("\nProfesores que SI tienen un teléfono registrado:");
             * for (Profesor prof : profesoresConTelefono) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> profesoresPorRango =
             * this.profesorService.seleccionarPorRangoId(1, 5);
             * System.out.println("\nProfesores en el rango de Ids de 1 a 5 :");
             * for (Profesor prof : profesoresPorRango) {
             * System.out.println(prof);
             * }
             */

            /*
             * //metoodos de typed y named query
             * List<Estudiante> estudiantesPorGenero =
             * this.estudianteService.seleccionarPorGenero("M");
             * System.out.println("\nEstudiantes con género 'M':");
             * for (Estudiante est : estudiantesPorGenero) {
             * System.out.println(est);
             * }
             * 
             * List<Estudiante> estudiantesPorGeneroTyped =
             * this.estudianteService.seleccionarPorGeneroTyped("F");
             * System.out.println("\nEstudiantes con género 'F' (TypedQuery):");
             * for (Estudiante est : estudiantesPorGeneroTyped) {
             * System.out.println(est);
             * }
             * 
             * List<Estudiante> estudiantesPorRangoFechas = this.estudianteService
             * .seleccionarPorRangosFechas(LocalDate.of(2000, 03, 21), LocalDate.of(2001,
             * 06, 25));
             * System.out.println("\nEstudiantes nacidos entre 2000 y 2001:");
             * for (Estudiante est : estudiantesPorRangoFechas) {
             * System.out.println(est);
             * }
             * 
             * Long totalEstudiantes = this.estudianteService.seleccionarContar();
             * System.out.println("\nTotal de estudiantes registrados: " +
             * totalEstudiantes);
             * 
             * List<Estudiante> estudiantesNative =
             * this.estudianteService.seleccionarTodosNative();
             * System.out.println("\nEstudiantes obtenidos con consulta native:");
             * for (Estudiante est : estudiantesNative) {
             * System.out.println(est);
             * }
             */

            /*
             * List<Profesor> profesoresPorNombre =
             * this.profesorService.seleccionarPorNombre("German Sinche");
             * System.out.println("\nProfesores con el nombre 'German Sinche':");
             * for (Profesor prof : profesoresPorNombre) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> profesorPorDireccion =
             * this.profesorService.seleccionarPorDireccion("Quito Sur");
             * System.out.println("\nProfesores con la dirección 'Quito Sur':");
             * for (Profesor prof : profesorPorDireccion) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> profesorPorTelefono =
             * this.profesorService.seleccionarPorTelefono("0987654321");
             * System.out.println("\nProfesores con el teléfono '0987654321':");
             * for (Profesor prof : profesorPorTelefono) {
             * System.out.println(prof);
             * }
             * 
             */

            /*
             * List<Profesor> profesoresNative =
             * this.profesorService.seleccionarProfesoresNative();
             * System.out.println("\nProfesores obtenidos con consulta native:");
             * for (Profesor prof : profesoresNative) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> profesoresPorNombreNative = this.profesorService
             * .seleccionarProfesoresPorNombreNative("German Sinche");
             * System.out.println("\nProfesores con el nombre 'German Sinche':");
             * for (Profesor prof : profesoresPorNombreNative) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> profesorPorDireccionNative = this.profesorService
             * .seleccionarProfesorPorDireccionNative("Quito Sur");
             * System.out.println("\nProfesores con la dirección 'Quito Sur':");
             * for (Profesor prof : profesorPorDireccionNative) {
             * System.out.println(prof);
             * }
             * 
             */

            /*
             * List<Estudiante> estudiantesCriteria =
             * this.estudianteService.seleccionarTodosCriteria();
             * System.out.println("\nEstudiantes obtenidos con consulta Criteria API:");
             * for (Estudiante est : estudiantesCriteria) {
             * System.out.println(est);
             * }
             * 
             * List<Estudiante> estudiantesPorNombreCriteria = this.estudianteService
             * .seleccionarPorNombreCriteria("mishell");
             * System.out.println("\nEstudiantes con el nombre 'mishell' Criteria:");
             * for (Estudiante est : estudiantesPorNombreCriteria) {
             * System.out.println(est);
             * }
             * System.out.println("--------------------------------------------------");
             * List<Estudiante> estudiantesDinamicoCriteria = this.estudianteService
             * .seleccionarDinamicoCriteria("mishell", "sinche");
             * System.out.
             * println("\nEstudiantes con el nombre 'mishell' y apellido 'sinche' Criteria:"
             * );
             * for (Estudiante est : estudiantesDinamicoCriteria) {
             * System.out.println(est);
             * }
             * 
             * List<Estudiante> estudiantesDinamicoCriteria2 = this.estudianteService
             * .seleccionarDinamicoCriteria("mishell", null);
             * System.out.
             * println("\nEstudiantes con el nombre 'mishell' y apellido nulo Criteria:");
             * for (Estudiante est : estudiantesDinamicoCriteria2) {
             * System.out.println(est);
             * }
             * 
             * List<Estudiante> estudiantesDinamicoCriteria3 = this.estudianteService
             * .seleccionarDinamicoCriteria(null, "pilataxi");
             * System.out.
             * println("\nEstudiantes con el nombre nulo y apellido 'pilataxi' Criteria:");
             * for (Estudiante est : estudiantesDinamicoCriteria3) {
             * System.out.println(est);
             * }
             * 
             * List<Estudiante> estudiantesDinamicoCriteria4 = this.estudianteService
             * .seleccionarDinamicoCriteria(null, null);
             * System.out.println("\nEstudiantes con el nombre y apellido nulos Criteria:");
             * for (Estudiante est : estudiantesDinamicoCriteria4) {
             * System.out.println(est);
             * }
             * 
             */
            /*
             * List<Profesor> seleccionarTodosCriteria =
             * this.profesorService.seleccionarTodosCriteria();
             * System.out.println("\nProfesores obtenidos con consulta Criteria API:");
             * for (Profesor prof : seleccionarTodosCriteria) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> seleccionarPorNombreCriteria = this.profesorService
             * .seleccionarPorNombreCriteria("German Sinche");
             * System.out.println("\nProfesores con el nombre 'German Sinche' Criteria:");
             * for (Profesor prof : seleccionarPorNombreCriteria) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> seleccionarDinamicoCriteria = this.profesorService
             * .seleccionarDinamicoCriteria("German Sinche", "0987654321");
             * System.out.
             * println("\nProfesores con el nombre 'German Sinche' y teléfono '0987654321' Criteria:"
             * );
             * for (Profesor prof : seleccionarDinamicoCriteria) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> seleccionarDinamicoCriteria2 = this.profesorService
             * .seleccionarDinamicoCriteria("German Sinche", null);
             * System.out.
             * println("\nProfesores con el nombre 'German Sinche' y teléfono nulo Criteria:"
             * );
             * for (Profesor prof : seleccionarDinamicoCriteria2) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> seleccionarDinamicoCriteria3 = this.profesorService
             * .seleccionarDinamicoCriteria(null, "0987654321");
             * System.out.
             * println("\nProfesores con el nombre nulo y teléfono '0987654321' Criteria:");
             * for (Profesor prof : seleccionarDinamicoCriteria3) {
             * System.out.println(prof);
             * }
             * 
             * List<Profesor> seleccionarDinamicoCriteria4 = this.profesorService
             * .seleccionarDinamicoCriteria(null, null);
             * System.out.println("\nProfesores con el nombre y teléfono nulos Criteria:");
             * for (Profesor prof : seleccionarDinamicoCriteria4) {
             * System.out.println(prof);
             * }
             * 
             */

            /*
             * Ciudadano ciudadano = new Ciudadano();
             * ciudadano.setNombre("Juan");
             * LocalDate fechaNacimiento = LocalDate.of(1990, 5, 15);
             * ciudadano.setFechaNacimiento(fechaNacimiento);
             * this.ciudadanoService.guardar(ciudadano);
             * 
             */
            /*
             * Usuario usuario = new Usuario();
             * usuario.setNombre("pedro");
             * usuario.setCedula("124457947");
             * usuario.setCorreo("pedrosjs@gmail.com");
             * this.usuarioService.guardar(usuario);
             * System.out.println(usuario);
             */

            /*
             * Empleado em1 = new Empleado();
             * em1.setNombre("jose");
             * em1.setFechaIngreso(LocalDateTime.now());
             * em1.setSalario(500.00);
             * // em1.setCiudadano(ciudadano);
             * em1.setCiudadano(new Ciudadano());
             * this.empleadoService.guardar(em1);
             * 
             * Ciudadano ciudadano2 = new Ciudadano();
             * ciudadano2.setNombre("Nuevo transaccion");
             * LocalDate fechaNacimiento2 = LocalDate.of(1990, 7, 12);
             * ciudadano2.setFechaNacimiento(fechaNacimiento2);
             * 
             * // ciudadano2.setNombre("Denis Nunez");
             * 
             * Empleado em2 = new Empleado();
             * em2.setNombre("mishell");
             * em2.setFechaIngreso(LocalDateTime.now());
             * em2.setSalario(null);
             * em1.setCiudadano(ciudadano2);
             * this.empleadoService.guardar(em1);
             * 
             */

            Usuario u1 = new Usuario();
            u1.setNombre("Ariel");
            u1.setCedula("1234493384");
            u1.setCorreo("ariel@uce.edu.ec");

            Pasaporte p1 = new Pasaporte();
            p1.setNumeroPasaporte("345");
            p1.setCodigoPais("593");
            p1.setUsuario(u1);
            this.pasaporteService.guardar(p1);

            return 0;

        }
    }
}
