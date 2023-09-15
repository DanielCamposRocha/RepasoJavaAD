package ejercicios;

import utilidades.Utilidades;

/*Ejercicio 104

Crea una clase Ejercicio_Piscina que sirva para calcular el aforo de una piscina comunitaria.

Con las medidas de seguridad derivadas de la situación sanitaria por motivos del COVID-19, las comunidades de vecinos han de regular la afluencia a sus piscinas comunitarias. Para ello han de calcular:

    la superficie de la piscina (del vaso que contiene el agua)

    la superficie de la parcela aledaña a la piscina

    Se reservarán 2 metros cuadrados por persona para asegurar la distancia interpersonal. Para calcular el aforo de la piscina comunitaria
     habrá que dividir cada una de las superficies calculadas anteriormente entre 2
     y se escogerá el menor de los dos resultados.

El código deberá pedir por teclado:

    La longitud de la piscina

    La anchura de la piscina

    La longitud de la parcela

    La anchura de la parcela

Además, se deberá gestionar que los datos introducidos no son erróneos para que no se produzca una excepción*/
public class Ejercicio104 {
    public final static double SUPERFICIE_PERSONA= 2;

    public static int aforo(){
        int aforo;
        double longuitud;
        double anchura;
        double superficiePiscina;
        double largo;
        double ancho;
        double superficieParcela;
        do {
            longuitud = Utilidades.pedirDouble("Introduzca longuitud de la piscina");
        }while(longuitud<1 | longuitud >200);
        do {
            anchura = Utilidades.pedirDouble("Introduzca ancho de la piscina");
        }while(anchura<1 | anchura >200);
        superficiePiscina=longuitud*anchura;
        do {
            largo = Utilidades.pedirDouble("Introduzca longuitud de la parcela");
        }while(largo<1 | largo >200);
        do {
            ancho = Utilidades.pedirDouble("Introduzca ancho de la parcela");
        }while(ancho<1 | ancho >200);
        superficieParcela=largo*ancho;

        if (superficiePiscina>superficieParcela){
            aforo =(int)(superficieParcela/SUPERFICIE_PERSONA);
        }
        else {
            aforo=(int)(superficiePiscina/SUPERFICIE_PERSONA);
        }
        System.out.println("El aforo permitido es: "+aforo);
    return aforo;
    }

}
