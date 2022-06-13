package Ejercicio12PUNTO5;
import java.io.*;

public class classHouse {
    
    private String code;
    private String population;
    private String direction;
    private int numroom = 0;
    private double price = 0.0;
    boolean esAlta;
    
    public classHouse() { 

        esAlta = true;
        asigna();

    }
   
    public void asigna(){

        BufferedReader entry = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("\n ingrese un Codigo (10 caracteres maximo): ");
            code = entry.readLine(); 
            System.out.print("\n ingrese la Población: ");
            population = entry.readLine(); 
            System.out.print("\n ingrese la Dirección de la casa: ");
            direction = entry.readLine(); 
            System.out.print("\n ingrese el Número de habitaciones de la casa: ");
            numroom = Integer.parseInt(entry.readLine()); 
            System.out.print("\n ingrese el Precio por día de hospedaje: ");
            price = Double.parseDouble(entry.readLine()); 
        }
        catch (IOException e)
        {
            System.out.println(" Excepcion en la entrada de datos " + 
            e.getMessage()+ " . No se da de alta");
            esAlta = false;
        }
    }

    public String getCodigo(){
        return code;
    }

 
    public void muestra() {
        System.out.println("\n Casa Rural numero: " + code);
        System.out.println("\n La cantidad de Población es: " + population);
        System.out.println("\n Dirección: " + direction);
        System.out.println("\n Precio por día: " + price);
        System.out.println("\n Numero de habitaciones: " + numroom);
    }
    
}
