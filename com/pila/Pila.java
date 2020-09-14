package com.pila;

/**
 * @author Dairo García
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

    public void Apilar(char dato) {
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
    
    public void Desapilar(){
        if (!this.isVacia()) {
            this.inicio = inicio.getSiguiente();
            this.tamanio--;
        }
    }
}
