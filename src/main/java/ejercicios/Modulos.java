package ejercicios;

public class Modulos {
    public String nombre;
    public double notaMedia;

    public Modulos(String nombre, double notaMedia) {
        this.nombre = nombre;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {
        return "nombre= " + nombre +", notaMedia=" + notaMedia;
    }

/*
    @Override
    public int compareTo(Modulos modulo1,Modulos modulo2) {
        return Double.compare(modulo2.getNotaMedia(), modulo1.getNotaMedia());
    }*/
}
