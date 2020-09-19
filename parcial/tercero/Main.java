package parcial.tercero;

public class Main {

    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        Paciente p1 = new Paciente();
        p1.setTipo(Hospital.getCUATRO());

        Paciente p2 = new Paciente();
        p2.setTipo(Hospital.getTRES());

        Paciente p3 = new Paciente();
        p3.setTipo(Hospital.getCUATRO());

        Paciente p4 = new Paciente();
        p4.setTipo(Hospital.getUNO());

        Paciente p5 = new Paciente();
        p5.setTipo(Hospital.getDOS());

        Paciente p6 = new Paciente();
        p6.setTipo(Hospital.getCUATRO());

        hospital.registroPacinte(p1);
        hospital.registroPacinte(p2);
        hospital.registroPacinte(p3);
        hospital.registroPacinte(p4);
        hospital.registroPacinte(p5);
        hospital.registroPacinte(p6);

        System.out.println(hospital);
        System.out.println("<----------------------------------------------->");

        System.out.println("<---- PRIMERO ---->");
        System.out.println(hospital.atenderPaciente());
        
        System.out.println("<---- SEGUNDO ---->");
        System.out.println(hospital.atenderPaciente());
        
        System.out.println("<---- TERCERO ---->");
        System.out.println(hospital.atenderPaciente());
        
        System.out.println("<------------------------------------------------>");
        System.out.println(hospital);
        

    }
}
