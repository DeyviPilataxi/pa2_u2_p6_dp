package ec.edu.uce.infraestructure.repository;

import java.util.List;

import javax.swing.text.html.parser.Entity;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class ProfesorRepositoryImpl implements ProfesorRepository {

    @Inject
    private EntityManager em;

    @Override
    public void crear(Profesor profesor) {
        this.em.persist(profesor);
    }

    @Override
    public Profesor seleccionarPorId(Integer id) {
        return this.em.find(Profesor.class, id);
    }

    @Override
    public void actualizar(Profesor profesor) {
        this.em.merge(profesor);

    }

    @Override
    public void eliminar(Integer id) {
        this.em.remove(this.seleccionarPorId(id));
    }

    @Override
    public List<Profesor> seleccionarPorNombreLike(String nombre) {
        TypedQuery<Profesor> miQuery = this.em.createQuery(
                "SELECT p FROM Profesor p WHERE p.nombre LIKE :nombreParam", Profesor.class);
        miQuery.setParameter("nombreParam", "%" + nombre + "%");
        return miQuery.getResultList();
    }

    @Override
    public List<Profesor> seleccionarConTelefonoRegistrado() {
        TypedQuery<Profesor> miQuery = this.em.createQuery(
                "SELECT p FROM Profesor p WHERE p.telefono IS NOT NULL", Profesor.class);
        return miQuery.getResultList();

    }

    @Override
    public List<Profesor> seleccionarPorRangoId(Integer idInicio, Integer idFin) {
        TypedQuery<Profesor> miQuery = this.em.createQuery(
                "SELECT p FROM Profesor p WHERE p.id BETWEEN :inicio AND :fin", Profesor.class);
        miQuery.setParameter("inicio", idInicio);
        miQuery.setParameter("fin", idFin);
        return miQuery.getResultList();
    }

}