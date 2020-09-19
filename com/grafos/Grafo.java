package com.grafos;

import java.util.HashSet;
import java.util.Set;

/**
 * @author user
 */
public class Grafo {

    private Set<Nodo> nodos = new HashSet<>();

    public void agregarNodo(Nodo nodeA) {
        this.nodos.add(nodeA);
    }

    public Set<Nodo> getNodos() {
        return nodos;
    }

    public void setNodos(Set<Nodo> nodos) {
        this.nodos = nodos;
    }

    @Override
    public String toString() {
        return "Grafo [" + "Nodos: " + nodos + ']';
    }
}
