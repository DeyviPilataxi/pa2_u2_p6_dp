package ec.edu.uce.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @SequenceGenerator(name = "seq_ciudad_generador", sequenceName = "seq_ciudad", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ciudad_generador")
    @Column(name = "ciud_id")
    private Integer id;

    @Column(name = "ciud_nombre")
    private String nombre;

    @Column(name = "ciud_numero_poblacion")
    private String numeroPoblacion;

    @ManyToOne
    private Pais pais;

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

    public String getNumeroPoblacion() {
        return numeroPoblacion;
    }

    public void setNumeroPoblacion(String numeroPoblacion) {
        this.numeroPoblacion = numeroPoblacion;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Ciudad [id=" + id + ", nombre=" + nombre + ", numeroPoblacion=" + numeroPoblacion + ", pais=" + pais
                + "]";
    }

}
