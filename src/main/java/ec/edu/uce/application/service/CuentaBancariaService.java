package ec.edu.uce.application.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.domain.model.CuentaBancaria;
import ec.edu.uce.domain.model.Transferencia;
import ec.edu.uce.domain.repository.CuentaBancariaRepository;
import ec.edu.uce.domain.repository.TransferenciaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CuentaBancariaService {

    @Inject
    private CuentaBancariaRepository cuentaRepository;

    public void guardarCuenta(CuentaBancaria cuenta) {
        this.cuentaRepository.crear(cuenta);
    }

    public CuentaBancaria buscarPorId(Integer id) {
        return this.cuentaRepository.buscarPorId(id);
    }

    @Transactional
    public void actualizar(CuentaBancaria origen, CuentaBancaria destino, BigDecimal monto) {

        if (origen.getSaldo().compareTo(monto) < 0) {
            throw new IllegalArgumentException("Saldo insuficiente en la cuenta de origen.");
        }

        origen.setSaldo(origen.getSaldo().subtract(monto));
        destino.setSaldo(destino.getSaldo().add(monto));

        cuentaRepository.actualizar(origen);
        cuentaRepository.actualizar(destino);
    }

}
