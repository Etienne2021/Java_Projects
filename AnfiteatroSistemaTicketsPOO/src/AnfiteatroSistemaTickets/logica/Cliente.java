package AnfiteatroSistemaTickets.logica;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private List<Ticket> listatickets;

    public Cliente() {
        this.listatickets = new ArrayList<>(); // Evita NullPointerException
    }

    public Cliente(int id, String dni, String nombre, String apellido) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listatickets =new ArrayList<>();
    }

    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public List<Ticket> getListatickets() { return listatickets; }

    //Método para agregar un ticket al cliente

    public void agregarTicket(Ticket ticket) {
        if (ticket != null) {
            this.listatickets.add(ticket);
        }
    }

    //Método para mostrar todos los tickets del cliente
    
    public void mostrarTickets() {
        if (listatickets.isEmpty()) {
            System.out.println("El cliente " + nombre + " no tiene tickets.");
        } else {
            System.out.println("Tickets del cliente " + nombre + ":");
            for (Ticket t : listatickets) {
                System.out.println(t);
            }
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }
}
