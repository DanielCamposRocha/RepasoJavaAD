package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;


public class Ejercicio107 {

    public static String entrada = "Nombre_Alumno# LMSXI # SI # BD # PRO # CD # FOL;Alumno 1  # 4     #    # 5  #  2  # 8  # 9;Alumno 2     # 5     # 3  # 6  #  7  # 10 # 6;Alumno 3     # 7     # 4  # 9  #  9  # 9  # 8;";
    public static String[] filas = entrada.split(";");
    public static ArrayList<Alumnos107> listaAlumnos;


    public static void generaAlumnos() {
        listaAlumnos = new ArrayList<>();
        for (int i = 1; i < filas.length; i++) {
            String[] columna = filas[i].split("#");
            listaAlumnos.add(new Alumnos107(columna[0], columna[1], columna[2], columna[3], columna[4], columna[5], columna[6]));
        }
        System.out.println(listaAlumnos);
    }

    public static void notaMediaAlumno() {
        for (Alumnos107 alumno : listaAlumnos) {
            int notaTotal = 0;
            int noMatricula = 0;
            if (alumno.LMSXI != -1) notaTotal += alumno.LMSXI;
            else noMatricula++;
            if (alumno.SI != -1) notaTotal += alumno.SI;
            else noMatricula++;
            if (alumno.BD != -1) notaTotal += alumno.BD;
            else noMatricula++;
            if (alumno.PRO != -1) notaTotal += alumno.PRO;
            else noMatricula++;
            if (alumno.CD != -1) notaTotal += alumno.CD;
            else noMatricula++;
            if (alumno.FOL != -1) notaTotal += alumno.FOL;
            else noMatricula++;
            System.out.println(alumno.nombre + " tiene una nota media de: " + ((double) notaTotal / (6 - noMatricula)));
        }
    }


    public static ArrayList<Modulos> notaMediaModulo() {
        ArrayList<Modulos> mediasModulos = new ArrayList<>();
        double lenguaje = 0;
        double LMSXIC = 0;
        double sistemas = 0;
        double SIC = 0;
        double bases = 0;
        double BDC = 0;
        double programacion = 0;
        double PROC = 0;
        double contornos = 0;
        double CDC = 0;
        double fol = 0;
        double folc = 0;

        for (Alumnos107 alumno : listaAlumnos) {
            if (alumno.LMSXI != -1) lenguaje += alumno.LMSXI;
            else LMSXIC++;
            if (alumno.SI != -1) sistemas += alumno.SI;
            else SIC++;
            if (alumno.BD != -1) bases += alumno.BD;
            else BDC++;
            if (alumno.PRO != -1) programacion += alumno.PRO;
            else PROC++;
            if (alumno.CD != -1) contornos += alumno.CD;
            else CDC++;
            if (alumno.FOL != -1) fol += alumno.FOL;
            else folc++;
        }
        mediasModulos.add(new Modulos("LMSXI", (double) lenguaje / (listaAlumnos.size() - LMSXIC)));
        mediasModulos.add(new Modulos("SI", (double) sistemas / (listaAlumnos.size() - SIC)));
        mediasModulos.add(new Modulos("Bases", (double) bases / (listaAlumnos.size() - BDC)));
        mediasModulos.add(new Modulos("Programacion", (double) programacion / (listaAlumnos.size() - PROC)));
        mediasModulos.add(new Modulos("Contornos", (double) contornos / (listaAlumnos.size() - CDC)));
        mediasModulos.add(new Modulos("Fol", (double) fol / (listaAlumnos.size() - folc)));


        return mediasModulos;
    }

    public static void alumnosLimpios() {
        int alumnoSuspensos = 0;
        for (Alumnos107 alumno : listaAlumnos) {
            int suspensas = 0;
            if (alumno.LMSXI != -1 && alumno.LMSXI < 5) suspensas++;
            if (alumno.SI != -1 && alumno.SI < 5) suspensas++;
            if (alumno.BD != -1 && alumno.BD < 5) suspensas++;
            if (alumno.PRO != -1 && alumno.PRO < 5) suspensas++;
            if (alumno.CD != -1 && alumno.CD < 5) suspensas++;
            if (alumno.FOL != -1 && alumno.FOL < 5) suspensas++;
            if (suspensas != 0) alumnoSuspensos++;
        }
        System.out.println((listaAlumnos.size() - alumnoSuspensos) + " alumnos que han aprobado todas");
    }

    public static void noMatriculas() {
        double lenguaje = 0;
        int noM = 0;
        double sistemas = 0;
        double bases = 0;
        double programacion = 0;
        double contornos = 0;
        double fol = 0;
        for (Alumnos107 alumno : listaAlumnos) {
            if (alumno.LMSXI == -1 | alumno.SI == -1 | alumno.BD == -1 | alumno.PRO == -1 | alumno.CD == -1 | alumno.FOL == -1)
                noM++;
        }
        System.out.println(noM + " alumnos no han cursado algun modulo");
    }

    public static void mediaAlta(){
        ArrayList<Modulos>listaModulos=notaMediaModulo();
        Collections.sort(listaModulos, new Comparator<Modulos>() {
            @Override
            public int compare(Modulos modulo1, Modulos modulo2) {

                return Double.compare(modulo2.getNotaMedia(), modulo1.getNotaMedia());
            }
        });
        System.out.println(listaModulos);
    }

    /*Indicar cuál es el alumno que mejor nota ha sacado por módulo.*/
    public static void mejorAlumno(){
        int lenguaje=0;
        String lenguajes="";
        int sistemas=0;
        String sistemass="";
        int bases=0;
        String basess="";
        int programacion=0;
        String progrmacions="";
        int contornos=0;
        String contornoss="";
        int fol=0;
        String fols="";

        for (Alumnos107 alumno:listaAlumnos
             ) {
            if(alumno.LMSXI>lenguaje) {
                lenguajes = alumno.getNombre();
                lenguaje=alumno.getLMSXI();
            }
            if(alumno.SI>sistemas) {
                sistemass = alumno.getNombre();
                sistemas=alumno.getSI();
            }
            if(alumno.BD>bases) {
                basess = alumno.getNombre();
                bases=alumno.getBD();
            }
            if(alumno.PRO>programacion) {
                progrmacions = alumno.getNombre();
                programacion=alumno.getPRO();
            }
            if(alumno.CD>contornos) {
                contornoss = alumno.getNombre();
                contornos=alumno.getCD();
            }
            if(alumno.FOL>fol) {
                fols = alumno.getNombre();
                fol=alumno.getFOL();
            }
        }
        System.out.println("Lenguaje de marcas:"+lenguajes+" con nota "+lenguaje);
        System.out.println("bases :"+basess+" con nota "+bases);
        System.out.println("sistemas:"+sistemass+" con nota "+sistemas);
        System.out.println("programacion:"+progrmacions+" con nota "+programacion);
        System.out.println("contornos:"+contornoss+" con nota "+contornos);
        System.out.println("FOL:"+fols+" con nota "+fol);

        TreeSet<Alumnos107>MejorAlumno= new TreeSet<>(Comparator.comparing(Alumnos107::getLMSXI));
        for (Alumnos107 alumno:listaAlumnos ) {
            MejorAlumno.add(alumno);
        }
        System.out.println("Lenguaje de marcas:"+MejorAlumno.last());
        MejorAlumno= new TreeSet<>(Comparator.comparing(Alumnos107::getSI));
        for (Alumnos107 alumno:listaAlumnos ) {
            MejorAlumno.add(alumno);
        }
        System.out.println("SI: "+MejorAlumno.last());
        MejorAlumno= new TreeSet<>(Comparator.comparing(Alumnos107::getBD));
        for (Alumnos107 alumno:listaAlumnos ) {
            MejorAlumno.add(alumno);
        }
        System.out.println("BD :"+MejorAlumno.last());
        MejorAlumno= new TreeSet<>(Comparator.comparing(Alumnos107::getPRO));
        for (Alumnos107 alumno:listaAlumnos ) {
            MejorAlumno.add(alumno);
        }
        System.out.println("PRO "+MejorAlumno.last());
        MejorAlumno= new TreeSet<>(Comparator.comparing(Alumnos107::getCD));
        for (Alumnos107 alumno:listaAlumnos ) {
            MejorAlumno.add(alumno);
        }
        System.out.println("CD "+MejorAlumno.last());
        MejorAlumno= new TreeSet<>(Comparator.comparing(Alumnos107::getFOL));
        for (Alumnos107 alumno:listaAlumnos ) {
            MejorAlumno.add(alumno);
        }
        System.out.println("FOL "+MejorAlumno.last());
    }
}