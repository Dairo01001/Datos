package parcial.segundo;

public class Main {
    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("Pedro", 'M', 100, 4);
        Usuario usuario2 = new Usuario("Maria", 'F', 150, 1);
        Usuario usuario3 = new Usuario("Matias", 'M', 100, 10);
        Usuario usuario4 = new Usuario("Anguie", 'F', 50, 5);
        
        Pila pila = new Pila();
        
        pila.Apilar(usuario1);
        pila.Apilar(usuario2);
        pila.Apilar(usuario3);
        pila.Apilar(usuario4);
        
        System.out.println(pila);
        
        pila.ordenarPorPiso();
        
        System.out.println(pila);
        
        pila.RemoverFondo();
        
        System.out.println(pila);
    }
}
