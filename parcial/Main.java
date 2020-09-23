package parcial;

public class Main {

    public static void main(String[] args) {
        Pila pila = new Pila();

        Disco d1 = new Disco("Rosado", 20, "Plata", 25);
        Disco d2 = new Disco("Verde", 21, "Oro", 14);
        Disco d3 = new Disco("Gris", 25, "Hierro", 25);
        Disco d4 = new Disco("Amarillo", 28, "Tierra", 45);

        pila.Apilar(d1);
        pila.Apilar(d2);
        pila.Apilar(d3);
        pila.Apilar(d4);

        System.out.println(pila);

        System.out.println(pila.Buscar(21, "Verde"));

        pila.Ordenar();
        System.out.println(pila.Mostrar());
        System.out.println(pila);
    }
}
