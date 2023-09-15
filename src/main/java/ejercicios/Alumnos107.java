package ejercicios;

public class Alumnos107 {
    public String nombre;
    public int LMSXI;
    public int SI;
    public int BD;
    public int PRO;
    public int CD;

    public Alumnos107(String nombre, String LMSXI, String SI, String BD, String PRO, String CD) {
        this.nombre = nombre;
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
    }
    public String imprimir(int nota){
        if (nota!=-1) return String.valueOf(nota);
        else return "No matriculado";
    }
    @Override
    public String toString() {
        return "Alumno: " + nombre + '\'' +
                ", LMSXI= " + imprimir(LMSXI) + '\'' +
                ", SI= " + imprimir(SI) + '\'' +
                ", BD= " + imprimir(BD) + '\'' +
                ", PRO= " + imprimir(PRO) + '\'' +
                ", CD= " + imprimir(CD);
    }
}
