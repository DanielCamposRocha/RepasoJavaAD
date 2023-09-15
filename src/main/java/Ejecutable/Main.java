package Ejecutable;

import ejercicios.*;
import utilidades.Menu;
import utilidades.Utilidades;


public class Main {
    public static void main(String[] args){
        menu();
    }
    private static void menu() {
        char op;
        Menu m=new Menu("Menu Principal",new String[] {"1.-Ejercicio 1 ","2.-Ejercicio 2","3.-Ejercicio 3","4.-Ejercicio 4","5.-Ejercicio 5","6.-Ejercicio 6","7.-Ejercicio 7","0.-Sair"},"01234567",Menu.Direccion.VERTICAL);

        do {
            op=m.getOption();
            switch (op) {
                case '1':
                    Ejercicio101.suma(Utilidades.pedirInt("Introduzca 1 para version FOREACH 2 para version FOR"));
                    break;

                case '2':
                    Ejercicio102.calculoJubilacion();
                    break;

                case '3':
                    Ejercicio103.nuevaCompra();
                    break;

                case '4':
                    Ejercicio104.aforo();
                    break;

                case '5':
                    Ejercicio105.piscina();
                    break;
                case '6':
                    Ejercicio106.agenda();
                    break;
                case '7':
                    Ejercicio107.generaAlumnos();
                    Ejercicio107.notaMediaAlumno();
                    break;

            }

        } while(op!='0');
    }
}