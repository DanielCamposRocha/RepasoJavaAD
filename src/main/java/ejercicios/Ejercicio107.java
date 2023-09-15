package ejercicios;

import java.util.ArrayList;

public class Ejercicio107 {
    public static String entrada="Nombre_Alumno# LMSXI # SI # BD # PRO # CD # FOL;Alumno 1  # 4     #    # 5  #  2  # 8  # 9;Alumno 2     # 5     # 3  # 6  #  7  # 10 # 6;Alumno 3     # 7     # 4  # 9  #  9  # 9  # 8;";
    public static String [] filas=entrada.split(";");
    public static ArrayList<Alumnos107> listaAlumnos;

    public static void generaAlumnos(){
        listaAlumnos=new ArrayList<>();
        for (int i=1;i< filas.length;i++) {
            String []columna=filas[i].split("#");
            listaAlumnos.add(new Alumnos107(columna[0],columna[1],columna[2],columna[3],columna[4],columna[5]));
        }
        System.out.println(listaAlumnos);
    }

    public static void notaMediaAlumno(){
        for (Alumnos107 alumno:listaAlumnos) {
            int notaTotal=0;
            int noMatricula=0;
            if(alumno.LMSXI!=-1)notaTotal+=alumno.LMSXI;
            else noMatricula++;
            if(alumno.SI!=-1)notaTotal+=alumno.SI;
            else noMatricula++;
            if(alumno.BD!=-1)notaTotal+=alumno.BD;
            else noMatricula++;
            if(alumno.PRO!=-1)notaTotal+=alumno.PRO;
            else noMatricula++;
            if(alumno.CD!=-1)notaTotal+=alumno.CD;
            else noMatricula++;
            System.out.println(alumno.nombre+ " tiene una nota media de: "+((double)notaTotal/(5-noMatricula)));
        }
    }

}
