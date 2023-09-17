package ejercicios.biblioteca;

import ejercicios.biblioteca.clases.Libros;
import ejercicios.biblioteca.clases.Revistas;
import utilidades.Utilidades;

import java.util.ArrayList;

/*    Creará un par de libros y revistas
    Los añadirá a la biblioteca
    Simulará el préstamo de algún libro/revista
    Simulará la devolución de esos libros/revistas*/
public class SistemaBiblioteca {
    static ArrayList<Biblioteca> biblioteca;


    public static void main(String[] args) {
        biblioteca=new ArrayList<>();
        generarMaterial();
        menu();



    }

    private static void generarMaterial() {
        biblioteca.add(new Biblioteca(false,new Libros("Programacion",123,"Dani")));
        biblioteca.add(new Biblioteca(false,new Libros("Java",321,"Cafeteros")));
        biblioteca.add(new Biblioteca(false,new Revistas("El Jueves",814,12)));
        biblioteca.add(new Biblioteca(false,new Revistas("El Lunes",214,524)));
    }

    public static void menu(){
        int op=0;
        do {
            op= Utilidades.pedirInt("1 Para PRESTAMOS de material, 2 Para DEVOLUCIONES de material");
            switch (op) {
                case 1:
                    Biblioteca.prestar();
                    break;
                case 2:
                    Biblioteca.devolver();
                    break;
            }
        }while(op!='0');
    }
}
