package org.example.Validaciones;

import org.example.Utilidades.Mensaje;

public class UsuarioPorEventoValidacion {
    public boolean validarTopePago (double costoEvento) throws Exception {
        if (costoEvento < 0) {
            throw new Exception(Mensaje.COSTO_NEGATIVO_PAGO_POR_EVENTO.getMensaje());
        }
        if (costoEvento > 200000) {
            throw new Exception(Mensaje.TOPE_VALOR_PAGADO_POR_EVENTO.getMensaje());
        }
        return true;

    }
}
