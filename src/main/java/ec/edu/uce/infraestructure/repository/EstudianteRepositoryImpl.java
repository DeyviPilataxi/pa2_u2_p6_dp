package ec.edu.uce.infraestructure.repository;

import java.time.LocalDate;
import java.util.List;

import javax.swing.text.html.parser.Entity;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.repository.EstudianteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Estudiante estudiante) {
        this.em.persist(estudiante);
    }

    @Override
    public Estudiante seleccionarPorId(Integer id) {
        return this.em.find(Estudiante.class, id);

    }

    @Override
    public void actualizar(Estudiante estudiante) {

        this.em.merge(estudiante);

    }

    @Override
    public void eliminar(Integer id) {
        this.em.remove(this.seleccionarPorId(id));

    }

    @Override
    public List<Estudiante> seleccionarTodos() {
        TypedQuery<Estudiante> miQuery = this.em.createQuery("SELECT e FROM Estudiante e ", Estudiante.class);
        return miQuery.getResultList();

    }

    @Override
    public List<Estudiante> seleccionarPorNombre(String nombre) {
        TypedQuery<Estudiante> miQuery = this.em.createQuery("SELECT e FROM Estudiante e WHERE e.nombre = :nombre1",
                Estudiante.class); // el nombre1 es para darle un nombre nuevo que daremos uso mas luego
        miQuery.setParameter("nombre1", nombre); // nombre1 porque quiere ser remplazado
        return miQuery.getResultList();
    }

    @Override
    public Estudiante seleccionarPorCedula(String cedula) {
        TypedQuery<Estudiante> miQuery = this.em
                .createQuery("SELECT e FROM Estudiante e WHERE e.cedula = :cedula1", Estudiante.class);
        miQuery.setParameter("cedula1", cedula);
        // return miQuery.getSingleResult();

        // return miQuery.getResultList().get(0);
        return miQuery.getResultList().getLast();
    }

    // 1.2 nameQuery
    @Override
    public List<Estudiante> seleccionarPorGenero(String genero) {
        Query miQuery = this.em.createNamedQuery("Estudiante.buscarPorGenero");
        miQuery.setParameter("genero", genero);
        return (List<Estudiante>) miQuery.getResultList();

    }

    @Override
    public List<Estudiante> seleccionarPorGeneroTyped(String genero) {
        TypedQuery<Estudiante> miQuery = this.em.createNamedQuery("Estudiante.buscarPorGenero", Estudiante.class);
        miQuery.setParameter("genero", genero);
        return miQuery.getResultList();

    }

    @Override
    public List<Estudiante> seleccionarPorRangosFechas(LocalDate fechaInicio, LocalDate fechaFin) {

        TypedQuery<Estudiante> miQuery = this.em.createNamedQuery("Estudiante.buscarPorRangosFechas", Estudiante.class);
        miQuery.setParameter("inicio", fechaInicio);
        miQuery.setParameter("fin", fechaFin);
        return miQuery.getResultList();

    }

    @Override
    public Long SeleccionarContar() {
        TypedQuery<Long> miQuery = this.em.createNamedQuery("Estudiante.contar", Long.class);
        return miQuery.getSingleResult();

    }

}