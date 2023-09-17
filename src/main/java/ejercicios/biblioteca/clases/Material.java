package ejercicios.biblioteca.clases;

public abstract class Material {
    private String titulo;
    private int numero_de_identificacion;

    public Material(String titulo, int numero_de_identificacion) {
        this.titulo = titulo;
        this.numero_de_identificacion = numero_de_identificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_de_identificacion() {
        return numero_de_identificacion;
    }

    public void setNumero_de_identificacion(int numero_de_identificacion) {
        this.numero_de_identificacion = numero_de_identificacion;
    }

    @Override
    public String toString() {
        return "titulo= " + titulo +", numero de identificacion= " + numero_de_identificacion;
    }
}
