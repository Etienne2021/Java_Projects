package reservaasientos;

import java.util.Scanner;

public class ReservaAsientos {

    public static void main(String[] args) {

        char asientos[][] = new char[10][10];
        boolean bandera = false;
        Scanner scanner = new Scanner(System.in);
        int fila = 0, asiento = 0;
        int continuar;
        int verasientos;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {

                asientos[i][j] = 'L';
            }
        }
        
        System.out.println("--------BIENVENIDO AL SISTEMA--------");
        
        while (bandera != true) {
            System.out.println("Desea ver los asientos disponibles?");
            System.out.println("Ingrese 1 para ver los asientos");
            verasientos = scanner.nextInt();
            if (verasientos == 1) {
                DibujarMapa(asientos);
            }

            boolean ok = false;
            while (ok != true) {
                System.out.println("Ingrese fila  a reservar");
                System.out.print("Fila (entre 0 y 9)");
                fila = scanner.nextInt();
                System.out.println("Ingrese  asiento a reservar");
                System.out.print("Asiento (entre 0 y 9)");
                asiento = scanner.nextInt();

                if (fila <= 9 && fila >= 0) {
                    if (asiento <= 9 && asiento >= 0) {
                        ok = true;
                    } else {
                        System.out.println("El numero del asiento no es valido");
                    }
                } else {
                    System.out.println("El numero de fila no es valido");
                }

            }
            if (asientos[fila][asiento] == 'L') {
                asientos[fila][asiento] = 'X';
                System.out.println("El asiento fue reservado con exito");
            } else {
                System.out.println("El asiento esta ocupado. Por favor elija otro");

            }

            System.out.println("Desea seguir reservando?. *Ingrese 1 para continuar o 0 para salir");
            continuar = scanner.nextInt();
            if (continuar == 0) {
                bandera = true;
            }

        }
    }

    static void DibujarMapa(char asientos[][]) {

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "");
            for (int j = 0; j < 10; j++) {

                System.out.print("[" + asientos[i][j] + "]");
            }
            System.out.println("");
        }

    }
}
