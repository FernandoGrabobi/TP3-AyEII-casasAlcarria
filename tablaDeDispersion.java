package Ejercicio12PUNTO5;

public class tablaDeDispersion{

    static final int TAMTABLA = 100; 
    private static int numElementos;
    private static double factorCarga;
    private static classHouse[] tabla;

    public tablaDeDispersion(){  
        tabla = new classHouse[TAMTABLA];
        for(int j = 0; j < TAMTABLA ; j++){
            tabla[j] = null;
            numElementos = 0;
            factorCarga = 0.0;
        }
    }
 
    public static int direccion(String keyCode) {
        int i = 0, p;
        long d;
        d = transformaCadena(keyCode); 
        p = (int)(d % TAMTABLA);
    
        while (tabla[p]!= null && !tabla[p].getCodigo().equals(keyCode)) {
            i++;
            p = p + i*i;
            p = p % TAMTABLA; 
        }
        return p;
    }
 
    public static long transformaCadena(String c) {
        long d = 0;
        for (int j = 0; j < Math.min(10,c.length()); j++){
            d = d * 27 + (int)c.charAt(j);
        }
        if (d < 0) d = -d;
        return d;
    }
    
    public void insertar(classHouse casaRural){
        int posicion;
        posicion = direccion(casaRural.getCodigo());
        tabla[posicion] = casaRural;
        numElementos++;
        factorCarga = (double)(numElementos)/TAMTABLA;
        if (factorCarga > 0.5){
            System.out.println("\n!! Factor de carga supera el 50%.!!" + " Conviene aumentar el tamaño." );
        }
    }

    public classHouse buscar(String keyCode){

        classHouse pr;
        int posicion;
        posicion = direccion(keyCode);
        pr = tabla[posicion];
        if (pr != null)
            if (! pr.esAlta) pr = null; 
        return pr;
    }

    public void eliminar(String keyCode){
        int posicion;
        posicion = direccion(keyCode);
        if (tabla[posicion] != null){
            tabla[posicion].esAlta = false;
        }
    }
    
}
