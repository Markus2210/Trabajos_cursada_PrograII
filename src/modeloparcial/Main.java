/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package modeloparcial;

import java.util.Scanner;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaExpedicion sistema = new SistemaExpedicion();
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE EXPEDICIONES ESPACIALES ---");
            System.out.println("1. Agregar nave");
            System.out.println("2. Mostrar todas las naves");
            System.out.println("3. Iniciar misión de exploración");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas por año (descendente)");
            System.out.println("6. Mostrar naves ordenadas por capacidad de tripulación");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero(sc);

            switch (opcion) {
                case 1:
                    agregarNave(sc, sistema);
                    break;
                case 2:
                    sistema.mostrar();
                    break;
                case 3:
                    sistema.iniciarExploracion();
                    break;
                case 4:
                    sistema.ordenarPorNombre();
                    sistema.mostrar();
                    break;
                case 5:
                    sistema.ordenarPorAnioLanzamiento();
                    sistema.mostrar();
                    break;
                case 6:
                    sistema.ordenarPorCapacidadTripulacion();
                    sistema.mostrar();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 7);
    }

    private static void agregarNave(Scanner sc, SistemaExpedicion sistema) {
        System.out.println("Tipo de nave:\n1. Exploración\n2. Carguero\n3. Crucero Estelar");
        int tipo = leerEntero(sc);

        System.out.print("Nombre de la nave: ");
        String nombre = sc.nextLine().trim();
        if (nombre.isEmpty()) {
            System.out.println("Nombre inválido.");
            return;
        }

        System.out.print("Capacidad de tripulación: ");
        int tripulacion = leerEntero(sc);

        System.out.print("Año de lanzamiento: ");
        int anio = leerEntero(sc);
        if (anio < 0) {
            System.out.println("Año inválido.");
            return;
        }

        switch (tipo) {
            case 1 -> {
                System.out.print("Tipo de misión (CARTOGRAFÍA / INVESTIGACIÓN / CONTACTO): ");
                String mision = sc.nextLine().toUpperCase();
                if (!mision.equals("CARTOGRAFÍA") && !mision.equals("INVESTIGACIÓN") && !mision.equals("CONTACTO")) {
                    System.out.println("Misión inválida.");
                    return;
                }
                sistema.agregarNave(new Exploracion(nombre, tripulacion, anio, tipoMision));
            }
            case 2 -> {
                System.out.print("Capacidad de carga (100-500): ");
                int carga = leerEntero(sc);
                sistema.agregarNave(new Cargueros(nombre, tripulacion, anio, carga));
            }
            case 3 -> {
                System.out.print("Cantidad de pasajeros: ");
                int pasajeros = leerEntero(sc);
                sistema.agregarNave(new CruceroEstelares(nombre, tripulacion, anio, pasajeros));
            }
            default ->
                System.out.println("Tipo inválido.");
        }
    }
    

    

    private static int leerEntero(Scanner sc) {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido: ");
            }
    }    
}
}


