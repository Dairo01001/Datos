package parcial.tercero;

public class Paciente {

    private String presion;

    private double peso;

    private double altura;

    private int edad;

    private char genero;

    private double temperatura;

    private String tipo;

    private int tiempoClinica;

    private int tiempoAtencion;

    private String especialista;

    private int costo;

    public Paciente() {
    }

    public Paciente(String tipo, String precion, double peso, double altura, int edad, char genero, double temperatura) {
        this.tipo = tipo;
        this.presion = precion;
        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.genero = genero;
        this.temperatura = temperatura;
    }

    public double getPresion() {
        String[] aux = presion.split("/");
        return Integer.parseInt(aux[0]) / Integer.parseInt(aux[1]);
    }

    public int getTiempoClinica() {
        return tiempoClinica;
    }

    public void setTiempoClinica(int tiempoClinica) {
        this.tiempoClinica = tiempoClinica;
    }

    public int getTiempoAtencion() {
        return tiempoAtencion;
    }

    public void setTiempoAtencion(int tiempoAtencion) {
        this.tiempoAtencion = tiempoAtencion;
    }

    public String getEspecialista() {
        return especialista;
    }

    public void setEspecialista(String especialista) {
        this.especialista = especialista;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Paciente ["
                + "\nTipo: " + tipo
                + "\nTiempo clinica: " + tiempoClinica
                + "\nCosto: " + costo
                + "\nTiempo Atencion: " + tiempoAtencion
                + "\nEspecialista: " + especialista
                + "\nPresión: " + presion
                + "\nPeso: " + peso
                + "\nAltura: " + altura
                + "\nEdad:" + edad
                + "\nGenero: " + genero
                + "\nTemperatura: " + temperatura
                + "\n]";
    }
}
