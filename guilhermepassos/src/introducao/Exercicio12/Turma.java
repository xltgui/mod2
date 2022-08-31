package introducao.Exercicio12;

import java.util.ArrayList;


public class Turma {
    private ArrayList<Crianca> listaCriancas = new ArrayList<>();

    private String serie;

    public ArrayList<Crianca> getListaCriancas() {
        return listaCriancas;
    }

    public void setListaCriancas(ArrayList<Crianca> listaCriancas) {
        this.listaCriancas = listaCriancas;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getSerie() {
        return serie;
    }

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        turma1.setSerie("5° série");

        Crianca c1 = new Crianca();
        c1.setNome("Zezinho");
        c1.setSexo("Masculino");

        Crianca c2 = new Crianca();
        c2.setNome("Mariazinha");
        c2.setSexo("Feminino");

        Crianca c3 = new Crianca();
        c3.setNome("Aninha");
        c3.setSexo("Feminino");

        Crianca c4 = new Crianca();
        c4.setNome("Julinha");
        c4.setSexo("Feminino");

        turma1.getListaCriancas().add(c1);
        turma1.getListaCriancas().add(c2);
        turma1.getListaCriancas().add(c3);
        turma1.getListaCriancas().add(c4);

        var y = turma1.contaMeninos();
        System.out.println("n° meninos: " + y);

        var x = turma1.contaMeninas();
        System.out.println("n° meninas: " + x);

    }

    public int contaMeninos() {
        int y = 0;
        for (var umaCrianca : getListaCriancas()) {
            if (umaCrianca.getSexo().equalsIgnoreCase("masculino")) {
                y += 1;
            }
        }

        return y;
    }

    public int contaMeninas() {
        int x = 0;
        for (var umaCrianca : getListaCriancas()) {
            if (umaCrianca.getSexo().equalsIgnoreCase("feminino")) {
                x += 1;
            }
        }
        return x;

    }
}
