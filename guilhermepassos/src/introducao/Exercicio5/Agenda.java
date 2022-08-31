package introducao.Exercicio5;

import java.util.ArrayList;

public class Agenda {
    private long id;
    private Medico medico;
    private ArrayList<Agendamento> listaAgendamentos = new ArrayList<>();

    public ArrayList<Agendamento> getListaAgendamentos() {
        return listaAgendamentos;
    }

    public void setListaAgendamentos(ArrayList<Agendamento> listaAgendamentos) {
        this.listaAgendamentos = listaAgendamentos;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void ImprimirAgenda() {
        StringBuilder montadorString = new StringBuilder();
        for (int i = 0; i < getListaAgendamentos().size(); i++) {
            Agendamento agendamento = listaAgendamentos.get(i);
            agendamento.getId();
            agendamento.getDataHora();
            agendamento.getPaciente().getNome();
            agendamento.getPaciente().getId();
            agendamento.getPaciente().getTelefone();

            System.out.println(agendamento.toString());
        }

        
        montadorString.append("\n" + "Médico: " + medico.getNome());
        montadorString.append("\n" + "Id: " + medico.getId());
        montadorString.append("\n" + "CRM: " + medico.getCRM());
        System.out.println(montadorString.toString());
    }

}
