package ec.edu.uce.domain.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @SequenceGenerator(name = "seq_alumno_generador", sequenceName = "seq_alumno", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_alumno_generador")
    @Column(name = "alum_id")
    private Integer id;

    @Column(name = "alum_nombre")
    private String nombre;

    // alumno es la predominante sin alumno no hay materia
    @ManyToMany
    @JoinTable(name = "alumno_materia", joinColumns = @JoinColumn(name = "alma_id_alumno"), inverseJoinColumns = @JoinColumn(name = "alma_id_materia")) // nombre
                                                                                                                                                        // de
                                                                                                                                                        // la
                                                                                                                                                        // tabla
                                                                                                                                                        // de
    // rompimiento que son
    // unidas de alumno y
    // materia
    // al de alumno y ma de materia es los fk de la nueva tabla
    private List<Materia> materias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMeterias() {
        return meterias;
    }

    public void setMeterias(List<Materia> meterias) {
        this.meterias = meterias;
    }

}
