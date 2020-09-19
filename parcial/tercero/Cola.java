package parcial.tercero;

public class Cola {

    private Nodo inicio;

    private Nodo termino;

    private int tamanio;

    public Cola() {
        this.inicio = null;
        this.termino = null;
    }

    public void Encolar(Paciente dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(null);
        if (this.isVacia()) {
            this.inicio = this.termino = nuevo;
        } else {
            this.termino.setSiguiente(nuevo);
        }
        this.termino = nuevo;
        this.tamanio++;
    }

    public Paciente Descencolar() {
        if (this.inicio == null) {
            return null;
        }
        Nodo aux = this.inicio;
        this.inicio = inicio.getSiguiente();
        if (this.inicio == null) {
            this.termino = null;
        }
        this.tamanio--;
        return aux.getDato();
    }

    public boolean isVacia() {
        return inicio == null && termino == null;
    }

    @Override
    public String toString() {
        String s = "Cola [";
        Nodo aux = this.inicio;
        for (int i = 0; i < this.tamanio; i++) {
            s += aux.getDato().toString() + "\n";
            aux = aux.getSiguiente();
        }
        s += "]";
        return s;
    }

    public Nodo getInicio() {
        return inicio;
    }

    public Nodo getTermino() {
        return termino;
    }

    public int getTamanio() {
        return tamanio;
    }

}
