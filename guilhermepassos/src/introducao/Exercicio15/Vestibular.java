package introducao.Exercicio15;

import java.util.ArrayList;

public class Vestibular {
    private ArrayList<Vestibulando> listaVestibulandos = new ArrayList<>();

    public static void main(String [] args) {
        Vestibular acafe = new Vestibular();
        
        Vestibulando vest1 = new Vestibulando();
        Vestibulando vest2 = new Vestibulando();
        Vestibulando vest3 = new Vestibulando();
        Vestibulando vest4 = new Vestibulando();

        vest1.setNome("Zezinho");
        vest2.setNome("Pedrinho");
        vest3.setNome("Huguinho");
        vest4.setNome("Luizinho");

        vest1.setNota(7);
        vest2.setNota(5);
        vest3.setNota(10);
        vest4.setNota(8);

        acafe.getListaVestibulandos().add(vest1);
        acafe.getListaVestibulandos().add(vest2);
        acafe.getListaVestibulandos().add(vest3);
        acafe.getListaVestibulandos().add(vest4);

        var y = acafe.gerarListaAprovados();
        System.out.println(y);

    }

    public String gerarListaAprovados(){
        StringBuilder x = new StringBuilder();

        for(var umVest : getListaVestibulandos()){
            if(umVest.getNota() >= 7){
                x.append("\nNome: " + umVest.getNome());
                x.append("\nNota: " + umVest.getNota());
            } 
        }

        return x.toString();
    }

    public ArrayList<Vestibulando> getListaVestibulandos() {
        return listaVestibulandos;
    }

    public void setListaVestibulandos(ArrayList<Vestibulando> listaVestibulandos) {
        this.listaVestibulandos = listaVestibulandos;
    }
}
