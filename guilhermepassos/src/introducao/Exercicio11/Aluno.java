package introducao.Exercicio11;

import java.util.ArrayList;

public class Aluno {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void setListaNotas(ArrayList<Nota> listaNotas) {
        this.listaNotas = listaNotas;
    }

    private String nome;
    private ArrayList<Nota> listaNotas = new ArrayList<>();

    public static void main(String[] args) {
        Aluno zezinho = new Aluno();
        zezinho.setNome("Zezinho da Silva");

        Nota nota1 = new Nota();
        Nota nota2 = new Nota();
        Nota nota3 = new Nota();

        nota1.setValor(5);
        nota2.setValor(7);
        nota3.setValor(6);
        
        zezinho.getListaNotas().add(nota1);
        zezinho.getListaNotas().add(nota2);
        zezinho.getListaNotas().add(nota3);


        var y = zezinho.calcMediaNotas();

        System.out.println(y);

    }

    public float calcMediaNotas() {
        float media = 0;
        for (var umaNota : this.getListaNotas()) {

            media += umaNota.getValor() / getListaNotas().size();
            
        }

        return media;
    }
}
