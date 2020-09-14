package pila;

/**
 * @author Dairo Garcia
 */
public class Pila {

    private Nodo inicio;
    private int tamanio;

    public Pila() {
    }

    public boolean isVacia() {
        return this.inicio == null;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void Apilar(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (this.isVacia()) {
            this.inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            this.inicio = nuevo;
        }
        this.tamanio++;
    }

    public Pila getNumerosPares() {
        Pila p = new Pila();
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            if (aux.getDato() % 2 == 0) {
                p.Apilar(aux.getDato());
            }
        }
        return p;
    }

    public Pila getNumerosImpares() {
        Pila p = new Pila();
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            if (aux.getDato() % 2 != 0) {
                p.Apilar(aux.getDato());
            }
        }
        return p;
    }

    @Override
    public String toString() {
        String s = "Pila: [ ";
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            s += "[" + aux.getDato() + "] ";
        }
        s += "]";
        return s;
    }

    public Nodo getInicio() {
        return inicio;
    }
    

}
