package ejercicios.biblioteca.clases;

import ejercicios.biblioteca.clases.Material;

public class Revistas extends Material {
    private int numero;

    public Revistas(String titulo, int numero_de_identificacion, int numero) {
        super(titulo, numero_de_identificacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return  "Titulo: "+this.getTitulo()+" numero de identificacion: "+this.getNumero_de_identificacion()+" numero=" + numero ;
    }
}
