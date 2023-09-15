package ejercicios;

import utilidades.Utilidades;

//Realiza un programa en Java que pida por teclado el nombre y la edad de una persona mayor de edad (se debe validar el valor introducido) y responda indicando:
//
//    Si no está jubilado (edad de jubilación = 65 años), cuántos años le quedan para jubilarse.
//    Si ya está jubilada indicará cuántos años lleva jubilado.
public class Ejercicio102 {
    public static final int EDAD_JUBILACION=65;
    public static void calculoJubilacion(){
        String nombre=Utilidades.pedirString("Introduzca su nombre");
        int edadReal= validarEdad();
        if(edadReal<65){
            System.out.println(nombre+" tiene usted "+edadReal+" años, le faltan "+(EDAD_JUBILACION-edadReal)+" años para jubilarse");
        }else{
            System.out.println(nombre+" tiene usted "+edadReal+" años, lleva "+(edadReal-EDAD_JUBILACION)+" años disfrutando de la jubilación");
        }
    }

    public static int validarEdad(){
        int edadValidada=0;
        do{
            int edadAValidar= Utilidades.pedirInt("Introduzca su edad");
            if (edadAValidar>=18 && edadAValidar<150){
             edadValidada=edadAValidar;
            }
        }while(edadValidada==0);
        return edadValidada;
    }
}
