package
        AnfiteatroSistemaTickets;

import AnfiteatroSistemaTickets.logica.Cliente;
import AnfiteatroSistemaTickets.logica.Ticket;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnfiteatroSistemaTickets {
    public static void main(String[] args) {
        List<Ticket> listatickets = new ArrayList<>();

        Ticket ticket1 = new Ticket(12, 2, 3, 1500, LocalDateTime.now(), LocalDateTime.now());
        Ticket ticket2 = new Ticket(13, 2, 4, 1500, LocalDateTime.now(), LocalDateTime.now());
        Ticket ticket3 = new Ticket(20, 5, 1, 2300, LocalDateTime.now(), LocalDateTime.now());

        listatickets.add(ticket1);
        listatickets.add(ticket2);
        listatickets.add(ticket3);

        double suma = 0;
        for (Ticket tick : listatickets) {
            suma += tick.getPrecio();
        }
        System.out.println("La suma de precio es de: " + suma);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de fila de la que desea ver tickets");
        int fila = scanner.nextInt();

        boolean bandera = false;
        for (Ticket tick : listatickets) {
            if (tick.getFila() == fila) {
                System.out.print(tick + "\n");
                bandera = true;
            }
        }
        if (!bandera) {
            System.out.println("No se encontraron datos de la fila en cuestión");
        }

        // Creación de un cliente
        Cliente cliente = new Cliente();
        cliente.setId(1);
        cliente.setNombre("Etienne");
        cliente.setApellido("Torres");
        cliente.setDni("12345678");

        // Agregar tickets al cliente
        cliente.agregarTicket(ticket1);
        cliente.agregarTicket(ticket2);

        // Mostrar los tickets del cliente
        cliente.mostrarTickets();
    }
}
