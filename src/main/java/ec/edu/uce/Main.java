package ec.edu.uce;

import java.time.LocalDate;

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

            Profesor prof = new Profesor();
            prof.setNombre("Julian");
            prof.setApellido("Alvarez");
            prof.setFechaNacimiento(LocalDate.of(2001, 07, 12));
            prof.setGenero("M");
            this.profesorService.guardar(prof);

            Profesor prof1 = new Profesor();
            prof1.setNombre("Enrique");
            prof1.setApellido("Kaviedes");
            prof1.setFechaNacimiento(LocalDate.of(1998, 03, 06));
            prof1.setGenero("M");
            this.profesorService.guardar(prof1);

            this.profesorService.buscarPorId(1);

            if (prof != null) {
                System.out.println("Profesor encontrado con éxito:");
                System.out.println("Nombre: " + prof.getNombre());
                System.out.println("Apellido: " + prof.getApellido());
                System.out.println("Género: " + prof.getGenero());
            } else {
                System.out.println("No se encontró ningún profesor ");

            }

            System.out.println("Actualizar");

            Profesor prof2 = this.profesorService.buscarPorId(1);

            if (prof2 != null) {

                prof2.setApellido("profesor Cambiado");

                this.profesorService.actualizar(prof2);
                System.out.println("Apellido actualizado con éxito.");
            } else {
                System.out.println("No se encontró el profesor para actualizar.");
            }

            this.profesorService.eliminar(2);
            System.out.println("estudiante eliminado");

            return 0;

        }
    }
}
