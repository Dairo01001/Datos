package parcial.segundo;

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

    public void Apilar(Usuario dato) {
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

    public void Desapilar() {
        if (!this.isVacia()) {
            this.inicio = inicio.getSiguiente();
            this.tamanio--;
        }
    }

    public boolean maximoPeso() {
        int peso = 0;
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            peso += aux.getDato().getPeso();
        }
        return peso < 500;
    }

    public boolean Buscar(Usuario referencia) {
        Nodo aux = inicio;
        boolean existe = false;
        while (existe != true && aux != null) {
            if (referencia == aux.getDato()) {
                existe = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }

    public void Remover(Usuario referencia) {
        if (Buscar(referencia)) {
            Nodo pilaAux = null;
            while (referencia != inicio.getDato()) {
                Nodo temp = new Nodo();
                temp.setDato(inicio.getDato());
                if (pilaAux == null) {
                    pilaAux = temp;
                } else {
                    temp.setSiguiente(pilaAux);
                    pilaAux = temp;
                }
                this.Desapilar();
            }
            this.Desapilar();
            while (pilaAux != null) {
                this.Apilar(pilaAux.getDato());
                pilaAux = pilaAux.getSiguiente();
            }
        }
    }

    public void RemoverFondo() {
        Nodo pilaAux = null;
        while (!this.isVacia()) {
            Nodo temp = new Nodo();
            temp.setDato(inicio.getDato());
            if (pilaAux == null) {
                pilaAux = temp;
            } else {
                temp.setSiguiente(pilaAux);
                pilaAux = temp;
            }
            this.Desapilar();
        }
        this.Desapilar();
        if (pilaAux != null) {
            pilaAux = pilaAux.getSiguiente();
        }
        while (pilaAux != null) {
            this.Apilar(pilaAux.getDato());
            pilaAux = pilaAux.getSiguiente();
        }
    }

    public void ordenarPorPiso() {
        Usuario[] usurios = new Usuario[this.tamanio];
        int i = 0;
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            usurios[i++] = aux.getDato();
        }
        for (int j = 0; j < usurios.length; j++) {
            for (int k = 0; k < usurios.length - j - 1; k++) {
                if (usurios[k].getPisoBajada() < usurios[k + 1].getPisoBajada()) {
                    Usuario temp = usurios[k + 1];
                    usurios[k + 1] = usurios[k];
                    usurios[k] = temp;
                }
            }
        }
        this.inicio = null;
        this.tamanio = 0;
        for (Usuario usurio : usurios) {
            this.Apilar(usurio);
        }
    }

    @Override
    public String toString() {
        String s = "Pila: [\n";
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            s += "[" + aux.getDato() + "]\n";
        }
        s += "]";
        return s;
    }
}
