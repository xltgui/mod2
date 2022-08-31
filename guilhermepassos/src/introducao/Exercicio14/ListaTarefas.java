package introducao.Exercicio14;

import java.util.ArrayList;


public class ListaTarefas {
    private ArrayList<Tarefa> listaTarefas = new ArrayList<>();

    public ArrayList<Tarefa> getListaTarefas() {
        return listaTarefas;
    }

    public void setListaTarefas(ArrayList<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }

    public static void main(String[] args){
        ListaTarefas lista1 = new ListaTarefas();
        
        Tarefa tar1 = new Tarefa();
        Tarefa tar2 = new Tarefa();
        Tarefa tar3 = new Tarefa();
        Tarefa tar4 = new Tarefa();
        Tarefa tar5 = new Tarefa();
        Tarefa tar6 = new Tarefa();


        tar1.setNome("Passear");
        tar2.setNome("Pescar");
        tar3.setNome("Fazer compras");
        tar4.setNome("Estudar");
        tar5.setNome("Trabalhar");
        tar6.setNome("Aprender orientação a objetos");

        TipoTarefa tipo1 = new TipoTarefa();
        tipo1.setNome("Fácil");
        tipo1.setTempo(10);

        TipoTarefa tipo2 = new TipoTarefa();
        tipo2.setNome("Médio");
        tipo2.setTempo(1);

        TipoTarefa tipo3 = new TipoTarefa();
        tipo3.setNome("Difícil");
        tipo3.setTempo(3);

        tar1.setTipo(tipo1);
        tar2.setTipo(tipo1);

        tar3.setTipo(tipo2);
        tar4.setTipo(tipo2);
        
        tar5.setTipo(tipo3);
        tar6.setTipo(tipo3);

        lista1.getListaTarefas().add(tar1);
        lista1.getListaTarefas().add(tar2);
        lista1.getListaTarefas().add(tar3);
        lista1.getListaTarefas().add(tar4);
        lista1.getListaTarefas().add(tar5);
        lista1.getListaTarefas().add(tar6);

        var x = lista1.calculaTempoTotal();
        System.out.println(x);
    }
    
    public float calculaTempoTotal(){
        float tempo = 0; 
        for(var umaTar : getListaTarefas()){

            tempo += umaTar.getTipo().getTempo();
        }
        return tempo;
    }
}
