package parcial.segundo;

public class Nodo {

    private Usuario dato;

    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Usuario dato) {
        this.dato = dato;
    }

    public Nodo(Usuario dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Usuario getDato() {
        return dato;
    }

    public void setDato(Usuario dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo [" + "Dato: " + dato + ", Siguiente: " + siguiente + ']';
    }
}
