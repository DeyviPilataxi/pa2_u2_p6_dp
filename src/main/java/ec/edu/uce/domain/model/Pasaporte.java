package ec.edu.uce.domain.model;

import javax.sound.sampled.UnsupportedAudioFileException;

import io.quarkus.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "pasaporte")
public class Pasaporte {

    @Id
    @SequenceGenerator(name = "seq_pasaporte_generador", sequenceName = "seq_pasaporte", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pasaporte_generador")
    private Integer id;

    @Column(name = "pas_numero_pasaporte")
    private String numeroPasaporte;

    @Column(name = "pas_codigo_pais")
    private String codigoPais;

    @OneToOne
    @JoinColumn(name = "pas_usuario")
    private Usuario usuario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Pasaporte [id=" + id + ", numeroPasaporte=" + numeroPasaporte + ", codigoPais=" + codigoPais
                + ", usuario=" + usuario + "]";
    }

}
