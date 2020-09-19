package parcial.tercero;

public class Nodo {

    private Paciente dato;

    private Nodo siguiente;

    public Nodo() {
        this.dato = null;
        this.siguiente = null;
    }

    public Nodo(Paciente dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(Paciente dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public Paciente getDato() {
        return dato;
    }

    public void setDato(Paciente dato) {
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
