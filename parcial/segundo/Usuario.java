package parcial.segundo;

public class Usuario {

    private String nombre;

    private char genero;

    private int peso;

    private int pisoBajada;

    public Usuario() {
    }

    public Usuario(String nombre, char genero, int peso, int pisoBajada) {
        this.nombre = nombre;
        this.genero = genero;
        this.peso = peso;
        this.pisoBajada = pisoBajada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPisoBajada() {
        return pisoBajada;
    }

    public void setPisoBajada(int pisoBajada) {
        this.pisoBajada = pisoBajada;
    }

    @Override
    public String toString() {
        return "Usuario [" + "Nombre: " + nombre + ", Genero: " + genero + ", Peso: " + peso + ", Piso Bajada: " + pisoBajada + ']';
    }
}
