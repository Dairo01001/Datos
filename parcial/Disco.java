package parcial;

public class Disco {

    private String color;

    private int tamanio;

    private String material;

    private int area;

    private int cont;

    public Disco() {
    }

    public Disco(String color, int tamanio, String material, int area) {
        this.color = color;
        this.tamanio = tamanio;
        this.material = material;
        this.area = area;
        this.cont = 0;
    }

    public int getCont() {
        return cont;
    }

    public void setCont() {
        this.cont++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Disco [" + "Color: " + color + ", Tamanio: " + tamanio + ", Material: " + material + ", Area: " + area
                + "\n" + "Numero de veces desapilo: " + cont + ']';
    }

    public String Mostrar(char medidor) {
        String aux = "";
        for (int i = 0; i < tamanio; i++) {
            aux += medidor;
        }
        return aux;
    }

}
