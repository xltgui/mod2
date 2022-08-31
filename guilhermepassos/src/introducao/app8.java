package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.Exercicio5.Agenda;
import introducao.Exercicio5.Agendamento;
import introducao.Exercicio5.Medico;
import introducao.Exercicio5.Paciente;

public class app8 {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente();
        paciente1.setId(1020);
        paciente1.setNome("Lucas");
        paciente1.setTelefone("1111-1111");

        Paciente paciente2 = new Paciente();
        paciente2.setId(1030);
        paciente2.setNome("Julia");
        paciente2.setTelefone("2222-2222");

        Paciente paciente3 = new Paciente();
        paciente3.setId(1040);
        paciente3.setNome("Vitor");
        paciente3.setTelefone("3333-3333");

        Paciente paciente4 = new Paciente();
        paciente4.setId(1050);
        paciente4.setNome("Laís");
        paciente4.setTelefone("4444-4444");

        Medico medico1 = new Medico();
        medico1.setId(2050);
        medico1.setNome("Dr. Dráuzio");
        medico1.setCRM("12");

        Medico medico2 = new Medico();
        medico2.setId(3050);
        medico2.setNome("Dr. Márcio");
        medico2.setCRM("11");

        Agenda agenda1 = new Agenda();
        agenda1.setMedico(medico1);

        Agenda agenda2 = new Agenda();
        agenda2.setMedico(medico2);

        Agendamento agendamento1 = new Agendamento();
        Calendar calendarioAg1 = GregorianCalendar.getInstance();
        calendarioAg1.set(2022,04,10,14,30);
        agendamento1.setDataHora(calendarioAg1.getTime());
        agendamento1.setMedico(medico1);
        agendamento1.setPaciente(paciente1);
        //System.out.println(agendamento1.getDataHora());

        Agendamento agendamento2 = new Agendamento();
        Calendar calendarioAg2 = GregorianCalendar.getInstance();
        calendarioAg2.set(2022,04,11,15,30);
        agendamento2.setDataHora(calendarioAg2.getTime());
        agendamento2.setMedico(medico2);
        agendamento2.setPaciente(paciente1);

        Agendamento agendamento3 = new Agendamento();
        Calendar calendarioAg3 = GregorianCalendar.getInstance();
        calendarioAg3.set(2022,04,11,18,00);
        agendamento3.setDataHora(calendarioAg3.getTime());
        agendamento3.setMedico(medico1);
        agendamento3.setPaciente(paciente2);

        Agendamento agendamento4 = new Agendamento();
        Calendar calendarioAg4 = GregorianCalendar.getInstance();
        calendarioAg4.set(2022,04,12,9,00);
        agendamento4.setDataHora(calendarioAg4.getTime());
        agendamento4.setMedico(medico2);
        agendamento4.setPaciente(paciente2);

        Agendamento agendamento5 = new Agendamento();
        Calendar calendarioAg5 = GregorianCalendar.getInstance();
        calendarioAg5.set(2022,04,12,14,00);
        agendamento5.setDataHora(calendarioAg5.getTime());
        agendamento5.setMedico(medico1);
        agendamento5.setPaciente(paciente3);

        Agendamento agendamento6 = new Agendamento();
        Calendar calendarioAg6 = GregorianCalendar.getInstance();
        calendarioAg6.set(2022,04,12,19,00);
        agendamento6.setDataHora(calendarioAg6.getTime());
        agendamento6.setMedico(medico2);
        agendamento6.setPaciente(paciente3);

        Agendamento agendamento7 = new Agendamento();
        Calendar calendarioAg7 = GregorianCalendar.getInstance();
        calendarioAg7.set(2022,04,13,8,00);
        agendamento7.setDataHora(calendarioAg7.getTime());
        agendamento7.setMedico(medico1);
        agendamento7.setPaciente(paciente4);

        Agendamento agendamento8 = new Agendamento();
        Calendar calendarioAg8 = GregorianCalendar.getInstance();
        calendarioAg8.set(2022,04,13,16,00);
        agendamento8.setDataHora(calendarioAg8.getTime());
        agendamento8.setMedico(medico2);
        agendamento8.setPaciente(paciente4);

        agenda1.ImprimirAgenda();
        agenda2.ImprimirAgenda();
        
        System.out.println(agenda1);



    }
}
