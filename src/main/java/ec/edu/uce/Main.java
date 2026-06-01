package ec.edu.uce;

import java.time.LocalDate;
import java.util.List;

import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.application.service.ProfesorService;
import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Profesor;
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
        @Inject
        private ProfesorService profesorService;

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

            List<Profesor> profesoresPorNombre = this.profesorService.seleccionarPorNombre("German Sinche");
            System.out.println("\nProfesores con el nombre 'German Sinche':");
            for (Profesor prof : profesoresPorNombre) {
                System.out.println(prof);
            }

            List<Profesor> profesorPorDireccion = this.profesorService.seleccionarPorDireccion("Quito Sur");
            System.out.println("\nProfesores con la dirección 'Quito Sur':");
            for (Profesor prof : profesorPorDireccion) {
                System.out.println(prof);
            }

            List<Profesor> profesorPorTelefono = this.profesorService.seleccionarPorTelefono("0987654321");
            System.out.println("\nProfesores con el teléfono '0987654321':");
            for (Profesor prof : profesorPorTelefono) {
                System.out.println(prof);
            }

            return 0;

        }
    }
}
