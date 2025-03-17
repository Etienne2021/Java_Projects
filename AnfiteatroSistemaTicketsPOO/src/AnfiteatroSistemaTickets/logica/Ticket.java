package AnfiteatroSistemaTickets.logica;

import java.time.LocalDateTime;

public class Ticket {

    private int numero;
    private int fila;
    private int asiento;
    private double precio;
    private LocalDateTime fechacompra;
    private LocalDateTime fechavalidez;

    public Ticket() {
    }

    public Ticket(int numero, int fila, int asiento, double precio, LocalDateTime fechacompra, LocalDateTime fechavalidez) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechacompra = fechacompra;
        this.fechavalidez = fechavalidez;
    }

    // Getters y Setters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public int getFila() { return fila; }
    public void setFila(int fila) { this.fila = fila; }

    public int getAsiento() { return asiento; }
    public void setAsiento(int asiento) { this.asiento = asiento; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public LocalDateTime getFechacompra() { return fechacompra; }
    public void setFechacompra(LocalDateTime fechacompra) { this.fechacompra = fechacompra; }

    public LocalDateTime getFechavalidez() { return fechavalidez; }
    public void setFechavalidez(LocalDateTime fechavalidez) { this.fechavalidez = fechavalidez; }

    @Override
    public String toString() {
        return "Ticket{" +
                "numero=" + numero +
                ", fila=" + fila +
                ", asiento=" + asiento +
                ", precio=" + precio +
                ", fechacompra=" + fechacompra +
                ", fechavalidez=" + fechavalidez +
                '}';
    }
}
