package org.example;
public class CustomException extends Exception{
   private int capacidadAeropuerto;

    public int CapacidadInsuficienteException(int capacidadAeropuerto) {
        super("Capacidad insuficiente: " + capacidadAeropuerto);
        this.capacidadAeropuerto = capacidadAeropuerto;
    }

    public int getCapacidadAeropuerto() {
        return capacidadAeropuerto;
    }

    @Override
    public String getMessage() {
        return super.getMessage() + ". La capacidad mínima requerida es: " + capacidadAeropuerto;
    }
}
