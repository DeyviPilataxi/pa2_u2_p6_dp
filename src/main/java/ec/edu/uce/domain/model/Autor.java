package ec.edu.uce.domain.model;

import java.util.List;

import com.arjuna.ats.internal.arjuna.objectstore.jdbc.drivers.postgres_driver;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor")
public class Autor {

    @Id
    @SequenceGenerator(name = "seq_autor_generador", sequenceName = "seq_autor", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor_generador")
    @Column(name = "auto_id")
    private Integer id;

    @Column(name = "auto_nombre")
    private String nombre;

    @Column(name = "auto_apellido")
    private String apellido;

    @Column(name = "auto_nacionalidad")
    private String nacionalidad;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "autor_libro", joinColumns = @JoinColumn(name = "liau_id_autor"), inverseJoinColumns = @JoinColumn(name = "liau_id_libro"))
    private List<Libro> libros;

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    @Override
    public String toString() {
        return "Autor [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad
                + ", libros=" + libros + "]";
    }

}
