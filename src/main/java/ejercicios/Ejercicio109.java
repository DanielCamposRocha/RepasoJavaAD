package ejercicios;

public class Ejercicio109 {
    public static void eliminarDuplicados(){
        int inicial[] ={20 ,20 ,30 , 40, 50, 50, 50};
        int []limpiado=new int[inicial.length];
        int repe=0;
        for (int i=0;i<inicial.length-1;i++) {
            for(int j=i+1;j<inicial.length;j++) {
                if(inicial[i] == inicial[j]){
                    limpiado[i]=-1;
                    repe++;
                }
            }
        }

        int[]terminado=new int[repe];
        int j=0;
        for (int i=0;i<inicial.length;i++) {
            if (limpiado[i]!=-1){
                terminado[j]=inicial[i];
                j++;
            }
        }
        for (int numero:terminado) {
            System.out.println(numero);
        }
        System.out.println(repe);
    }
}
