package ejercicios;

import utilidades.Utilidades;

/*
El programa solicitará al usuario que introduzca dos números:

    El primer número indicará el desplazamiento:
        Se tendrá en cuenta el desplazamiento siguiendo la tabla ASCII que cuenta con un alfabeto de 26 letras
    El segundo número indicará:
        1: cifrar.
        2: descifrar.

Se deberán tener en cuenta el uso de las mayúsculas y de las minúsculas

Minusculas 97 a 122 Mayusculas de 65 a 90
* */
public class Ejercicio110 {
    public static void codigoCesar(String texto) {
        int desplazamiento= Utilidades.pedirInt("Introduzca desplazamiento");
        boolean op=iscifrado();
        char[] entrada=texto.toCharArray();
        char[] salida=new char[entrada.length];
        String acabado="";
        for (int i=0;i<entrada.length;i++) {
            if(op) {
                salida[i]= (char) (entrada[i]+desplazamiento);
                if(entrada[i]>(int)'A' && entrada[i]<(int)'Z'){
                    while(salida[i]<65){
                        salida[i]+=26;
                    }
                    while(salida[i]>90){
                        salida[i]-=26;
                    }
                }
                if(entrada[i]>97 && entrada[i]<122){
                    while(salida[i]<97){
                        salida[i]+=26;
                    }
                    while(salida[i]>122){
                        salida[i]-=26;
                    }
                }
            }
            else {
                salida[i]= (char) (entrada[i]-desplazamiento);
                if(entrada[i]>(int)'A' && entrada[i]<'Z'){
                    while(salida[i]<(int)'A'){
                        salida[i]+=26;
                    }
                    while(salida[i]>(int)'Z'){
                        salida[i]-=26;
                    }
                }
                if(entrada[i]>(int)'a' && entrada[i]<(int)'z'){
                    while(salida[i]<(int)'a'){
                        salida[i]+=26;
                    }
                    while(salida[i]>(int)'z'){
                        salida[i]-=26;
                    }
                }
            }
        }
        for (int i=0;i<salida.length;i++) {


        }
        for (char letra:salida ) {
            acabado+=letra;
        }
        System.out.println(acabado);
    }

    private static boolean iscifrado() {
        int i;
        do{
           i= Utilidades.pedirInt("1: cifrar.       2: descifrar");
        }while(i != 1 && i!=2);
        if(i==2)return false;
        return true;
    }
}
