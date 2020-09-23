package parcial;

public class Nodo {

    private Disco dato;

    private Nodo siguiente;

    public Disco getDato() {
        return dato;
    }

    public void setDato(Disco dato) {
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
