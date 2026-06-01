package ec.edu.uce.domain.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "profesor")
@NamedQueries({
        @NamedQuery(name = "Profesor.buscarPorNombre", query = "SELECT e FROM Profesor e WHERE e.nombre = :nombre"),
        @NamedQuery(name = "Profesor.buscarPorTelefono", query = "SELECT e FROM Profesor e WHERE e.telefono = :telefono"),
        @NamedQuery(name = "Profesor.buscarPorDireccion", query = "SELECT e FROM Profesor e WHERE e.direccion = :direccion"),
        @NamedQuery(name = "Profesor.contar", query = "SELECT COUNT(e) FROM Profesor e ")

})
public class Profesor {

    @Id
    @SequenceGenerator(name = "seq_profesor_generador", sequenceName = "seq_profesor", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_profesor_generador")
    @Column(name = "prof_id")
    private Integer id;

    @Column(name = "prof_nombre")
    private String nombre;

    @Column(name = "prof_correo")
    private String correo;

    @Column(name = "prof_telefono")
    private String telefono;

    @Column(name = "prof_direccion")
    private String direccion;

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Profesor [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", telefono=" + telefono
                + ", direccion=" + direccion + "]";
    }

}
