package ec.edu.uce.application.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.domain.model.CuentaBancaria;
import ec.edu.uce.domain.model.Transferencia;
import ec.edu.uce.domain.repository.TransferenciaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class TransferenciaService {

    @Inject
    private TransferenciaRepository transferenciaRepository;

    @Transactional
    public void registrarTransferencia(Transferencia transferencia) {
        this.transferenciaRepository.registrar(transferencia);
    }

    @Transactional
    public void registrarTransferencia(CuentaBancaria origen, CuentaBancaria destino, BigDecimal monto) {

        Transferencia trans = new Transferencia();
        trans.setCuentaOrigen(origen);
        trans.setCuentaDestino(destino);
        trans.setMonto(monto);
        trans.setFecha(LocalDateTime.now());

        this.transferenciaRepository.registrar(trans);

        System.out.println("¡Transferencia realizada con éxito por " + monto);
    }

}
