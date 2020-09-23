package parcial;

public class Pila {

    private Nodo inicio;

    private int tamanio;

    public Nodo getInicio() {
        return inicio;
    }

    public int getTamanio() {
        return tamanio;
    }

    public Pila() {
    }

    public boolean isVacia() {
        return this.inicio == null;
    }

    public void Apilar(Disco dato) {
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

    public void Ordenar() {
        Disco[] discos = new Disco[this.tamanio];
        int i = 0;
        for (; this.inicio != null;) {
            discos[i++] = this.Desapilar().getDato();
        }
        for (int j = 0; j < discos.length; j++) {
            for (int k = 0; k < discos.length - j - 1; k++) {
                if (discos[k].getTamanio() < discos[k + 1].getTamanio()) {
                    Disco temp = discos[k + 1];
                    discos[k + 1] = discos[k];
                    discos[k] = temp;
                }
            }
        }
        this.Eliminar();
        for (Disco disco : discos) {
            this.Apilar(disco);
        }
    }

    public boolean Buscar(int tamanio, String color) {
        Nodo aux = inicio;
        boolean existe = false;
        while (existe != true && aux != null) {
            if (tamanio == aux.getDato().getTamanio() && color.equals(aux.getDato().getColor())) {
                existe = true;
            } else {
                aux = aux.getSiguiente();
            }
        }
        return existe;
    }

    public Nodo Desapilar() {
        Nodo aux = null;
        if (!this.isVacia()) {
            aux = this.inicio;
            aux.getDato().setCont();

            this.inicio = inicio.getSiguiente();
            this.tamanio--;
        }
        return aux;
    }

    public void Eliminar() {
        this.inicio = null;
        this.tamanio = 0;
    }

    @Override
    public String toString() {
        String s = "Pila: [\n";
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            s += "[" + aux.getDato().toString() + "]\n";
        }
        s += "]";
        return s;
    }

    public String Mostrar() {
        String s = "";
        for (Nodo aux = this.inicio; aux != null; aux = aux.getSiguiente()) {
            s += "\n" + aux.getDato().Mostrar('*');
        }
        return s;
    }
}
