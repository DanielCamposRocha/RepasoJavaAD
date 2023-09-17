package ejercicios.biblioteca.clases;

import ejercicios.biblioteca.clases.Material;

public class Libros extends Material {
    private String nombreAutor;

    public Libros(String titulo, int numero_de_identificacion, String nombreAutor) {
        super(titulo, numero_de_identificacion);
        this.nombreAutor = nombreAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    @Override
    public String toString() {
        return "Titulo: "+this.getTitulo()+" numero de identificacion: "+this.getNumero_de_identificacion()+" nombreAutor='" + nombreAutor;
    }
}
