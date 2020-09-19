package parcial.primero;

public class Cola {

    private Nodo inicio;

    private Nodo termino;

    private int tamanio;

    public Cola() {
        this.inicio = null;
        this.termino = null;
    }

    public void Encolar(Cliente dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(null);
        if (this.inicio == null & this.termino == null) {
            this.inicio = nuevo;
            this.termino = nuevo;
        }
        this.termino.setSiguiente(nuevo);
        this.termino = this.termino.getSiguiente();
        this.tamanio++;
    }

    public Cliente Descencolar() {
        this.tamanio--;
        Cliente dato = this.inicio.getDato();
        this.inicio = this.inicio.getSiguiente();
        return dato;
    }

    public Cliente Buscar(int rut) {
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            if (aux.getDato().getRut() == rut) {
                return aux.getDato();
            }
        }
        return null;
    }

    public boolean isVacia() {
        return inicio == null & termino == null;
    }

    public Cliente siguientePersona() {
        if (this.isVacia()) {
            return this.inicio.getSiguiente().getDato();
        }
        return null;
    }

    @Override
    public String toString() {
        String s = "Cola [";
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            s += aux.getDato().toString() + "\n";
        }
        s += "]";
        return s;
    }
}
