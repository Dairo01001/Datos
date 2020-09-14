package com.pila;

/**
 * @author Dairo García Naranjo
 */
public class Nodo {

    private char dato;
    private Nodo siguiente;

    public Nodo() {
    }

    public Nodo(char dato) {
        this.dato = dato;
    }

    public Nodo(char dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
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
