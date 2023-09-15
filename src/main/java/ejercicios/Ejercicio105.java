package ejercicios;
import utilidades.Menu;
import utilidades.Utilidades;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Ejercicio105 {
    static int franja;
    public static int aforo;
    public static String [][] Fecha;
    public static void piscina(){
        aforo=Ejercicio104.aforo();
        Fecha= new String[6][aforo];
        char op;
        Menu m=new Menu("Menu Principal",new String[] {"1.-Nueva Reserva ","2.-Listar reservas","0.-Sair"},"012",Menu.Direccion.VERTICAL);

        do {
            op=m.getOption();
            switch (op) {
                case '1':
                    reserva();
                    break;

                case '2':
                    listareservas();
                    break;

                }

        } while(op!='0');
    }

    private static void listareservas() {
        for (int i=0;i<6;i++){
            for(int j=0;j<aforo;j++){
                if(Fecha[i][j]==null){
                    System.out.print("--------  ");
                }else{
                System.out.print(Fecha[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void reserva() {

        String DNI;
        int salir;
        int hora;
        int c=0;
        do {
            do {
                if (c != 0) {
                    System.out.println("recuerde debe introducir un numero entero entre el 1 y el 6");
                }
                hora = Utilidades.pedirInt("Introduzca franja horaria del 1 al 6");
                c = 1;
            } while (hora < 1 | hora > 6);
            franja = hora - 1;
            if (recorroFecha() == 0) {
                System.out.println("No hay plazas libres en esa franja");
            } else {
                DNI = validarDNI();
                if (repetirDNI(DNI)) {
                    System.out.println("Este usuario ya ha reservado en la fecha seleccionada");
                } else {
                    for (int i = 0; i < aforo; i++) {
                        if (Fecha[franja][i] == null) {
                            Fecha[franja][i] = DNI;
                            break;
                        }
                    }
                }
            }
            salir=Utilidades.pedirInt("desea salir pulse 0 sino cualquier otro numero");
        }while(salir!=0);
    }

    private static boolean repetirDNI(String DNI) {
        for(int j=0;j<6;j++){
            for(int i=0; i<aforo;i++){
                if (Fecha[j][i]!=null){
                    if (Fecha[j][i].equals(DNI)) return TRUE;
                }
            }
        }
        return FALSE;
    }

    public static int recorroFecha(){
        int libres=0;
        for(int i=0; i<aforo;i++){
            if (Fecha[franja][i]==null) libres++;
        }
        return libres;
    }

    public static String validarDNI(){
        String DNI=Utilidades.pedirString("Introduzca DNI");
        Pattern patron=Pattern.compile("[0-9]{8}[A-Z]");
        Matcher mat=patron.matcher(DNI);
        while(!mat.matches()){
            System.out.println("DNI no valido, recuerde 8 cifras y una letra");
            DNI=Utilidades.pedirString("Introduzca DNI");
            mat=patron.matcher(DNI);
        }
        return DNI;
    }

}
