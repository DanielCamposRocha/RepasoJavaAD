package ejercicios;

import utilidades.Menu;
import utilidades.Utilidades;

import java.util.ArrayList;

/*
* Desarrolla un programa en Java permita crear una lista de contactos que puedes agregar, eliminar y mostrar. Cada contacto estará representado por una clase Contacto.

El programa implementará un menú que permita:

    Agregar contacto
    Mostrar contacto
    Eliminar contacto*/
public class Ejercicio106 {
    public static ArrayList<Contactos> listaContactos;

    public static void agenda(){

        listaContactos= new ArrayList<Contactos>();
        char op;
        Menu m=new Menu("Menu Principal",new String[] {"1.-Agregar Contacto ","2.-Mostrar contactos","3.Eliminar contactos","4.-Listar agenda","0.-Sair"},"01234",Menu.Direccion.VERTICAL);

        do {
            op=m.getOption();
            switch (op) {
                case '1':
                    Contactos contacto=new Contactos(Utilidades.pedirString("Introduzca nombre del contacto"),Utilidades.pedirInt("introduzca numero del contacto"));
                    buscarContacto(contacto);
                    if(contacto==null) {
                        listaContactos.add(contacto);
                    }else{
                        System.out.println("El contacto ya existe");
                    }
                    break;

                case '2':
                    if(buscarContacto()==null){
                        System.out.println("El contacto buscado no existe en la agenda");
                    }
                    break;

                case '3':
                    Contactos contacto=buscarContacto();
                    if(contacto==null){
                        System.out.println("El contacto buscado no existe en la agenda");
                    } else{
                        listaContactos.remove(contacto);
                    }
                    break;
                case '4':
                    System.out.println(listaContactos);
                    break;

            }

        } while(op!='0');
    }

    private static boolean buscarContacto(Contactos contacto) {
        for (Contactos existen:listaContactos) {
            if(existen.getNombre().equals(contacto.getNombre()) && existen.getNumero()== contacto.getNumero()) return true;
        }
        return false;
    }

    private static Contactos buscarContacto() {
        int op=Utilidades.pedirInt("Desea buscar por Nombre pulse 1 por numero pulse 2 salir pulse 0");
        switch (op){
            case 1:
                for (Contactos contacto:listaContactos) {
                        if(contacto.getNombre().equals(Utilidades.pedirString("Introduzca Nombre a buscar"))){
                            System.out.println(contacto);
                            return contacto;
                        }
                    }
                    break;
            case 2:
                    for (Contactos contacto:listaContactos) {
                        if(contacto.getNumero()==Utilidades.pedirInt("Introduzca numero a buscar")){
                            System.out.println(contacto);
                            return contacto;
                        }
                    }
                    break;
            }
        return null;
    }


}
