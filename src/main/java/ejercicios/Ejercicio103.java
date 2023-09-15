package ejercicios;

import utilidades.Utilidades;

import java.util.ArrayList;

public class Ejercicio103 {
    /*Ejercicio 103

Realiza un programa en Java que gestione la compra de los productos de un supermercado.

El programa solicitará el nombre del producto y su precio en bucle.

Después de de introducir estos datos, preguntará si deseamos continuar introduciendo más productos. Las posibles respuestas serán SI para seguir en el bucle y NO para salir.

Al terminar, mostrará el importe total de la compra y cuántos productos hemos comprado.*/
    public static ArrayList<Producto> listaCompra;
    public static void nuevaCompra(){
        listaCompra=new ArrayList<>();
        String seguir="SI";

        do{
            listaCompra.add(new Producto(Utilidades.pedirString("Introduzca nombre del producto"),Utilidades.pedirDouble("Introduzca precio")));
            do {
                seguir=Utilidades.pedirString("Introduzca SI para seguir, NO para salir");
            }while(!seguir.equals("SI") && !seguir.equals("NO"));
        }while(seguir.equals("SI"));
        System.out.println(" Ha comprado "+listaCompra.size()+" productos con un coste final de "+coste()+" €");
    }
    public static double coste(){
        double precioFinal= 0.0;
        for (Producto producto:listaCompra
        ) {
            precioFinal=precioFinal+producto.getPrecio();
        }
        return precioFinal;
    }
}
