package ec.edu.uce.domain.model;

import java.io.Serial;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

    @Id
    @SequenceGenerator(name = "seq_empleado_generador", sequenceName = "seq_empleado", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_empleado_generador")
    @Column(name = "empl_id")
    private Integer id;

    @Column(name = "empl_nombre")
    private String nombre;

    @Column(name = "empl_salario")
    private Double salario;

    @Column(name = "empl_fecha_ingreso")
    private LocalDateTime fechaIngreso;

    // en la tabla secuendaria vamos a declaro mi entidad principal

    @OneToOne
    @JoinColumn(name = "empl_ciudadano")
    private Ciudadano ciudadano;

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

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public LocalDateTime getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDateTime fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", salario=" + salario + ", fechaIngreso=" + fechaIngreso
                + "]";
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

}
