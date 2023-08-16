package org.example.Utilidades;

public enum Mensaje {
    FORMATO_NOMBRE("Revise el formato del nombre"),
    LONGITUD_NOMBRE("El nombre debe ser mayor a 10 digitos"),
    FORMATO_UBICACION("La ubicacion debe ser un numero"),
    FORMATO_NIT("El NIT debe contener ser solo numeros"),
    LONGITUD_NIT("El nombre de la empresa no puede sobrepasar los 30 caracteres"),
    TAMANIO_NIT("El campo nit debe tener  10 dígitos"),
    FORMATO_TITULO_OFERTA("El titulo de la oferta no puede sobrepasar los 20 caracteres"),
    COSTO_PERSONA("El costo no puede ser negativo"),
    FECHAS_NULAS("Las fechas no pueden ser nulas"),
    FECHA_INICIO("La fecha de inicio no puede ser mayor que la fecha de fin"),
    FECHA_FORMATO("El formato debe ser DD/MM/YYYY"),
    CANTIDAD_PERSONAS_RESERVA("El número de personas por reserva no puede ser mayor a 4 personas"),
    FORMATO_CORREO("Revise el formato del correo");

    private String mensaje;

    Mensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
