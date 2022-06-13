package Ejercicio12PUNTO5;
import java.util.Scanner;

public class Ejercicio12 {

    // Metodos
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcionesMenu = 0;
        String keyCode;
        tablaDeDispersion tablaHash = new tablaDeDispersion();
       
        do {
            try {
                System.out.println("\n Presione 1 para Insertar una Casa Rural \n");
                System.out.println("Presione 2 para Eliminar una Casa Rural \n");
                System.out.println("Presione 3 para buscar un elemento \n");
                System.out.println("Presione 0 para salir del programa \n");
                opcionesMenu = input.nextInt();
                input.nextLine();

            } catch (Exception e) {
                System.out.println("Ingreso un valor no valido\n");
            }

            switch (opcionesMenu) {
                case 1:
                    clearScreen();
                    try {

                        classHouse casaInsertar = new classHouse();
                        tablaHash.insertar(casaInsertar);

                    } catch (Exception e) {
                        System.out.println(" Ingreso un valor no valido\n");
                    }
                break;
                case 2:
                    clearScreen();
                    try {

                        System.out.println(" Ingrese la clave para poder realizar la eliminacion");
                        keyCode=input.nextLine();
                        tablaHash.eliminar(keyCode);
               
                    } catch (Exception e) {
                        System.out.println("Ingreso un valor no valido\n");
                    }
                break;
                case 3:
                    clearScreen();
                    try {

                        System.out.println(" Ingrese la clave para poder buscar la casa");
                        keyCode=input.nextLine();
                        tablaHash.buscar(keyCode);

                    } catch (Exception e) {
                        System.out.println("Ingreso un valor no valido\n");
                    }
                break;
                case 0:
                    clearScreen();
                    System.out.println(" El programa a finalizado correctamente ");
                    input.close();
                break;
                default:
                    clearScreen();
                    System.out.println(" \n Ingrese una opcion valida ");
                break;
            }
        } while (opcionesMenu != 0);
        input.close();
    }
}
