package parcial.primero;

public class Cliente {

    private static int tipoGeneral, tipoCliente, tipoEmpresas;

    private static int movimientoGiro, movimientoDeposito, movimientoPago, movimientoCheque;

    public static int getTipoGeneral() {
        return tipoGeneral;
    }

    public static void setTipoGeneral() {
        Cliente.tipoGeneral++;
    }

    public static int getTipoCliente() {
        return tipoCliente;
    }

    public static void setTipoCliente() {
        Cliente.tipoCliente++;
    }

    public static int getTipoEmpresas() {
        return tipoEmpresas;
    }

    public static void setTipoEmpresas() {
        Cliente.tipoEmpresas++;
    }

    public static int getMovimientoGiro() {
        return movimientoGiro;
    }

    public static void setMovimientoGiro() {
        Cliente.movimientoGiro++;
    }

    public static int getMovimientoDeposito() {
        return movimientoDeposito;
    }

    public static void setMovimientoDeposito() {
        Cliente.movimientoDeposito++;
    }

    public static int getMovimientoPago() {
        return movimientoPago;
    }

    public static void setMovimientoPago() {
        Cliente.movimientoPago++;
    }

    public static int getMovimientoCheque() {
        return movimientoCheque;
    }

    public static void setMovimientoCheque() {
        Cliente.movimientoCheque++;
    }

    private int rut;

    private String nombre;

    private int montoMovimiento;

    public Cliente() {
    }

    public Cliente(int rut, String nombre, int montoMovimiento) {
        this.rut = rut;
        this.nombre = nombre;
        this.montoMovimiento = montoMovimiento;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(int montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    @Override
    public String toString() {
        return "Cliente [" + "Rut: " + rut + ", Nombre: " + nombre + ", Monto Movimiento: " + montoMovimiento + ']';
    }
}
