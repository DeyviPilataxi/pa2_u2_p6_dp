package ec.edu.uce.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pais")
public class Pais {

    @Id
    @SequenceGenerator(name = "seq_pais_generador", sequenceName = "seq_pais", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pais_generador")
    @Column(name = "pais_id")
    private Integer id;

    @Column(name = "pais_nombre")
    private String nombre;

    @Column(name = "pais_codigo")
    private String codigo;

    @OneToMany(mappedBy = "pais", cascade = CascadeType.ALL)
    private List<Ciudad> ciudades;

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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(List<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    @Override
    public String toString() {
        return "Pais [id=" + id + ", nombre=" + nombre + ", codigo=" + codigo + ", ciudades=" + ciudades + "]";
    }

}
