package ejercicios;

import java.util.Comparator;

public class Alumnos107 {
    public String nombre;
    public int LMSXI;
    public int SI;
    public int BD;
    public int PRO;
    public int CD;
    public int FOL;

    public Alumnos107(String nombre, String LMSXI, String SI, String BD, String PRO, String CD,String FOL) {
        this.nombre = nombre.trim();
        try{
            this.LMSXI = Integer.parseInt(LMSXI.trim());
        }catch (NumberFormatException e){
            this.LMSXI=-1;
        }
        try{
            this.SI = Integer.parseInt(SI.trim());
        }catch (NumberFormatException e){
            this.SI=-1;
        }
        try{
            this.BD = Integer.parseInt(BD.trim());
        }catch (NumberFormatException e){
            this.BD=-1;
        }
        try{
            this.PRO = Integer.parseInt(PRO.trim());
        }catch (NumberFormatException e){
            this.PRO=-1;
        }
        try{
            this.CD = Integer.parseInt(CD.trim());
        }catch (NumberFormatException e){
            this.CD=-1;
        }
        try{
            this.FOL = Integer.parseInt(FOL.trim());
        }catch (NumberFormatException e){
            this.FOL=-1;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getLMSXI() {
        return LMSXI;
    }

    public int getSI() {
        return SI;
    }

    public int getBD() {
        return BD;
    }

    public int getPRO() {
        return PRO;
    }

    public int getCD() {
        return CD;
    }

    public int getFOL() {
        return FOL;
    }

    public String imprimir(int nota){
        if (nota!=-1) return String.valueOf(nota);
        else return "No matriculado";
    }
    @Override
    public String toString() {
        return "Alumno: " + nombre +
                ", LMSXI= " + imprimir(LMSXI) +
                ", SI= " + imprimir(SI) +
                ", BD= " + imprimir(BD) +
                ", PRO= " + imprimir(PRO) +
                ", CD= " + imprimir(CD)+
                ", FOL= "+imprimir(FOL);
    }


    public int compareTo(Alumnos107 alumno1,Alumnos107 alumno2,int a) {
        int devolver=0;
        if(a==1) devolver= Double.compare(alumno1.LMSXI, alumno2.LMSXI);
        if(a==2) devolver= Double.compare(alumno1.SI, alumno2.SI);
        if(a==3) devolver= Double.compare(alumno1.BD, alumno2.BD);
        if(a==4) devolver= Double.compare(alumno1.PRO, alumno2.PRO);
        if(a==5) devolver= Double.compare(alumno1.CD, alumno2.CD);
        if(a==6) devolver= Double.compare(alumno1.FOL, alumno2.FOL);
        return  devolver;
    }

}
