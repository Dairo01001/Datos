package com.pila;

import java.util.Scanner;

/**
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pila pila = new Pila();

        // 7 - (x * ((x + y) / (j - 3)) + y / (4 - (5 / 2)))
        String f = sc.nextLine();

        for (int i = 0; i < f.length(); i++) {
            if (f.charAt(i) == '(' || f.charAt(i) == ')') {
                if (f.charAt(i) == '(') {
                    pila.Apilar('(');
                } else {
                    pila.Desapilar();
                }
            }
        }

        if (pila.isVacia()) {
            System.out.println("Valanceada");
        } else {
            System.out.println("Desvalanceada");
        }
    }
}
