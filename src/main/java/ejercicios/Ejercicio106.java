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
                    if(buscarContacto(contacto)) {
                        System.out.println("El contacto ya existe");
                    }else{
                        listaContactos.add(contacto);
                    }
                    break;

                case '2':
                    if(buscarContacto().size()==0){
                        System.out.println("El contacto buscado no existe en la agenda");
                    }
                    break;

                case '3':
                    ArrayList persona=buscarContacto();
                    if(persona.size()==0){
                        System.out.println("El contacto buscado no existe en la agenda");
                    }if(persona.size()==1){
                        listaContactos.remove(persona.get(0));
                    }else{
                        for(int i=0;i<persona.size();i++){
                            System.out.println(i+"- "+persona.get(i));
                        }
                        listaContactos.remove(persona.get(Utilidades.pedirInt("Indique el numero del contacto de la lista previa que desea borrar")));
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

    private static ArrayList<Contactos> buscarContacto() {
        ArrayList<Contactos> comunes=new ArrayList<>();
        int op=Utilidades.pedirInt("Desea buscar por Nombre pulse 1 por numero pulse 2 salir pulse 0");
        switch (op){
            case 1:
                String nombre=Utilidades.pedirString("Introduzca Nombre a buscar");
                for (Contactos contacto:listaContactos) {
                        if(contacto.getNombre().equals(nombre)){
                            comunes.add(contacto);
                        }
                    }
                System.out.println("Los contactos con el nombre buscado son: ");
                System.out.println(comunes);
                    break;
            case 2:
                int numero=Utilidades.pedirInt("introduzca numero a buscar");
                for (Contactos contacto:listaContactos) {
                        if(contacto.getNumero()==numero){
                            comunes.add(contacto);
                        }
                }
                System.out.println("Los contactos con el numero buscado son: ");
                System.out.println(comunes);
                    break;
            }
        return comunes;
    }


}
