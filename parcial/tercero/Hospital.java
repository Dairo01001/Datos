package parcial.tercero;

public class Hospital {
    
    private static final String UNO = "Enfermedad muy grave";
    private static final String DOS = "Enfermedad Grave";
    private static final String TRES = "Posible Enfermedad";
    private static final String CUATRO = "Sin enfermedad";
    
    private Cola triageUno;
    
    private Cola triageDos;
    
    private Cola triageTres;
    
    private Cola triageCuatro;
    
    private int cantidadPacientesAtendidos;
    private int cantidadPacienteF;
    
    private int tiempo;
    
    public Hospital() {
        this.triageUno = new Cola();
        this.triageDos = new Cola();
        this.triageTres = new Cola();
        this.triageCuatro = new Cola();
    }
    
    public static String getUNO() {
        return UNO;
    }
    
    public static String getDOS() {
        return DOS;
    }
    
    public static String getTRES() {
        return TRES;
    }
    
    public static String getCUATRO() {
        return CUATRO;
    }
    
    public int getCantidadPacientesAtendidos() {
        return cantidadPacientesAtendidos;
    }
    
    public int getCantidadPacienteF() {
        return cantidadPacienteF;
    }
    
    public Cola getTriageUno() {
        return triageUno;
    }
    
    public void setTriageUno(Cola triageUno) {
        this.triageUno = triageUno;
    }
    
    public Cola getTriageDos() {
        return triageDos;
    }
    
    public void setTriageDos(Cola triageDos) {
        this.triageDos = triageDos;
    }
    
    public Cola getTriageTres() {
        return triageTres;
    }
    
    public void setTriageTres(Cola triageTres) {
        this.triageTres = triageTres;
    }
    
    public Cola getTriageCuatro() {
        return triageCuatro;
    }
    
    public void setTriageCuatro(Cola triageCuatro) {
        this.triageCuatro = triageCuatro;
    }
    
    public Paciente atenderPaciente() {
        Paciente aux;
        if (!this.triageUno.isVacia()) {
            aux = this.triageUno.Descencolar();
        } else if (!this.triageDos.isVacia()) {
            aux = this.triageDos.Descencolar();
        } else if (!this.triageTres.isVacia()) {
            aux = this.triageTres.Descencolar();
        } else {
            aux = this.triageCuatro.Descencolar();
        }
        if (aux == null) {
            return null;
        } else {
            this.tiempo += aux.getTiempoAtencion();
            aux.setTiempoClinica(tiempo);
            this.cantidadPacientesAtendidos++;
            if (aux.getGenero() == 'F') {
                this.cantidadPacienteF++;
            }
        }
        return aux;
    }
    
    public void registroPacinte(Paciente paciente) {
        switch (paciente.getTipo()) {
            case UNO:
                paciente.setEspecialista("Internista");
                paciente.setCosto(90000);
                paciente.setTiempoAtencion(20);
                this.triageUno.Encolar(paciente);
                break;
            case DOS:
                paciente.setEspecialista("Especialista");
                paciente.setCosto(50000);
                paciente.setTiempoAtencion(20);
                this.triageDos.Encolar(paciente);
                break;
            case TRES:
                paciente.setEspecialista("Medico general");
                paciente.setCosto(35000);
                paciente.setTiempoAtencion(15);
                this.triageTres.Encolar(paciente);
                break;
            default:
                paciente.setEspecialista("Enfermera");
                paciente.setCosto(20000);
                paciente.setTiempoAtencion(10);
                this.triageCuatro.Encolar(paciente);
                break;
        }
    }
    
    @Override
    public String toString() {
        return "Hospital [\n" + "Triage Uno:" + triageUno + ", Triage Dos: " + triageDos + ", Triage Tres: " + triageTres + ", Triage Cuatro: " + triageCuatro + ']';
    }
    
}
