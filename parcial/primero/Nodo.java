package parcial.primero;

public class Nodo {

    private Cliente dato;

    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(Cliente dato) {
        this.dato = dato;
    }

    public Nodo(Cliente dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
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
