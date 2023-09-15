package ejercicios;

public class Ejercicio101 {
    public static String texto = "4;5;7;8;4";
    //sumar los numeros de un string separados por ;
    public static void suma(int a){
        int sumafinal=0;
        String [] numeros=texto.split(";");
        if(a==1){
            for (String numero:numeros ) {
                sumafinal=sumafinal+Integer.parseInt(numero);
            }
        }else {
            for(int i=0;i< numeros.length;i++){
                sumafinal=sumafinal+Integer.parseInt(numeros[i]);
            }
        }
        System.out.println("La suma es : "+sumafinal);
    }
}
