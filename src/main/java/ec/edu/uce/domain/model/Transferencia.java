package ec.edu.uce.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "transferencia")
public class Transferencia {

    @Id
    @SequenceGenerator(name = "seq_transferencia_generador", sequenceName = "seq_transferencia_bancaria", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_transferencia_generador")
    @Column(name = "tran_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tran_id_cuenta_origen")
    private CuentaBancaria cuentaOrigen;

    @ManyToOne
    @JoinColumn(name = "tran_id_cuenta_destino")
    private CuentaBancaria cuentaDestino;

    @Column(name = "tran_monto")
    private BigDecimal monto;

    @Column(name = "tran_fecha")
    private LocalDateTime fecha;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CuentaBancaria getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public CuentaBancaria getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(CuentaBancaria cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transferencia [id=" + id + ", cuentaOrigen=" + cuentaOrigen + ", cuentaDestino=" + cuentaDestino
                + ", monto=" + monto + ", fecha=" + fecha + "]";
    }

}
