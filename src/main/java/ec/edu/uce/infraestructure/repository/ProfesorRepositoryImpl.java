package ec.edu.uce.infraestructure.repository;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.criteria.Predicate;

import javax.swing.text.html.parser.Entity;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.model.Profesor;
import ec.edu.uce.domain.repository.ProfesorRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
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

    @Override
    public List<Profesor> seleccionarPorNombre(String nombre) {
        TypedQuery<Profesor> miQuery = this.em.createNamedQuery("Profesor.buscarPorNombre", Profesor.class);
        miQuery.setParameter("nombre", nombre);
        return miQuery.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorDireccion(String direccion) {
        TypedQuery<Profesor> miQuery = this.em.createNamedQuery("Profesor.buscarPorDireccion", Profesor.class);
        miQuery.setParameter("direccion", direccion);
        return miQuery.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorTelefono(String telefono) {
        TypedQuery<Profesor> miQuery = this.em.createNamedQuery("Profesor.buscarPorTelefono", Profesor.class);
        miQuery.setParameter("telefono", telefono);
        return miQuery.getResultList();
    }

    @Override
    public Long contarProfesores() {
        TypedQuery<Long> miQuery = this.em.createNamedQuery("Profesor.contar", Long.class);
        return miQuery.getSingleResult();
    }

    // NATIVE QUERY
    @Override
    @SuppressWarnings("unchecked")
    public List<Profesor> seleccionarProfesoresNative() {
        List<Profesor> resultado = this.em.createNativeQuery("SELECT * FROM profesor", Profesor.class).getResultList();
        return resultado;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Profesor> seleccionarProfesoresPorNombreNative(String nombre) {
        List<Profesor> resultado = this.em.createNativeQuery("SELECT * FROM profesor WHERE prof_nombre = :nombre",
                Profesor.class).setParameter("nombre", nombre).getResultList();
        return resultado;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Profesor> seleccionarProfesorPorDireccionNative(String direccion) {
        List<Profesor> resultado = this.em.createNativeQuery("SELECT * FROM profesor WHERE prof_direccion = :direccion",
                Profesor.class).setParameter("direccion", direccion).getResultList();
        return resultado;
    }

    // criteria API

    @Override
    public List<Profesor> seleccionarTodosCriteria() {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<Profesor> myQuery = cb.createQuery(Profesor.class);
        Root<Profesor> root = myQuery.from(Profesor.class);
        myQuery.select(root);
        TypedQuery<Profesor> query = this.em.createQuery(myQuery);
        return query.getResultList();
    }

    @Override
    public List<Profesor> seleccionarPorNombreCriteria(String nombre) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<Profesor> myQuery = cb.createQuery(Profesor.class);
        Root<Profesor> root = myQuery.from(Profesor.class);
        myQuery.select(root).where(cb.equal(root.get("nombre"), nombre));
        TypedQuery<Profesor> query = this.em.createQuery(myQuery);
        return query.getResultList();
    }

    @Override
    public List<Profesor> seleccionarDinamicoCriteria(String nombre, String telefono) {

        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<Profesor> myQuery = cb.createQuery(Profesor.class);
        Root<Profesor> root = myQuery.from(Profesor.class);

        List<Predicate> condiciones = new ArrayList<>();

        if (nombre != null) {

            Predicate p1 = cb.equal(root.get("nombre"), nombre);

            condiciones.add(p1);
        }
        if (telefono != null) {

            Predicate p2 = cb.equal(root.get("telefono"), telefono);

            condiciones.add(p2);
        }

        myQuery.select(root).where(condiciones);
        TypedQuery<Profesor> query = this.em.createQuery(myQuery);
        return query.getResultList();
    }

}