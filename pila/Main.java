package pila;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {

        Pila pila = new Pila();
        for (int i = 0; i < 20; i++) {
            pila.Apilar((int) (Math.random() * 100));
        }
        
        System.out.println(pila.getInicio());
        
        System.out.println(pila);
        System.out.println(pila.getNumerosPares());
        System.out.println(pila.getNumerosImpares());
        
        
        
        // Segundo punto
        Scanner sc = new Scanner(System.in);
        Pila p = new Pila();
        for (int i = 0; i < 10; i++) {
            System.out.print("Digita un entero: ");
            p.Apilar(sc.nextInt());
        }
        System.out.println(p); 
        
    }
}
