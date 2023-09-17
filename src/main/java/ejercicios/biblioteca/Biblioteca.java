package ejercicios.biblioteca;

import ejercicios.biblioteca.clases.Material;
import utilidades.Utilidades;

import java.util.ArrayList;

/*    almacenar el catálogo de libros que tiene la biblioteca disponibles y los libros que están siendo prestados.
    prestar libros
    ver los libros prestados
    devolver los libros prestados*/
public class Biblioteca {

    private final Material material;
    private boolean prestamo;


    public Biblioteca(boolean prestamo, Material material) {
        this.prestamo = prestamo;
        this.material=material;
    }

    public Material getMaterial() {
        return material;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

    public static void prestar() {
        System.out.println(SistemaBiblioteca.biblioteca);
        int num=Utilidades.pedirInt("Indique numero de identificacion");
        for (Biblioteca elemento:SistemaBiblioteca.biblioteca) {
            if(elemento.getMaterial().getNumero_de_identificacion()==num){
                if (elemento.isPrestamo()) System.out.println("Material en prestamo");
                else {
                    elemento.setPrestamo(true);
                    System.out.println("Prestamo correcto");
                    System.out.println(elemento);
                }
                break;
            }
        }
    }

    public static void devolver() {
        int num=Utilidades.pedirInt("Indique numero de identificacion");
        for (Biblioteca elemento:SistemaBiblioteca.biblioteca) {
            if(elemento.getMaterial().getNumero_de_identificacion()==num){
                if (elemento.isPrestamo()){
                    elemento.setPrestamo(false);
                    System.out.println("Devolucion efectuada");
                }
                else System.out.println("Material en la biblioteca");
                System.out.println(elemento);
                break;
            }
        }
    }


    @Override
    public String toString() {
        return material +", prestamo=" + prestamo;
    }
}
