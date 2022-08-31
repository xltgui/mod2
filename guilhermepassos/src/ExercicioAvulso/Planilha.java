package ExercicioAvulso;

import java.util.ArrayList;

public class Planilha {
    private ContaDeLuz contaDeLuz;
    private ArrayList<ContaDeLuz> listaContasDeluz = new ArrayList<>();

    public float calculaUltimoValorMedio() {
        float soma = 0;
        float media = 0;
        for (ContaDeLuz umaConta : listaContasDeluz) {
            soma = soma + umaConta.getValorDaConta();
            /*
             * umaConta.getDataLeitura();
             * umaConta.getDataPagamento();
             * umaConta.getNumeroLeitura();
             * umaConta.getQuantidadeKw();
             * umaConta.getValorDaConta();
             * umaConta.getValorMedio();
             */
        }
        media = soma / listaContasDeluz.size();

        return media;
    }

    public float calculaMaiorValor() {
        float valor = 0;
        float maior = 0;
        for (ContaDeLuz umaConta : listaContasDeluz) {
            valor = umaConta.getValorDaConta();
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    public float calculaMenorValor() {
        float menor = 0;
        if (listaContasDeluz.size() >= 1) {
            menor = listaContasDeluz.get(0).getValorDaConta();
        }

        for (ContaDeLuz umaConta : listaContasDeluz) {
            if (menor > umaConta.getValorDaConta())
                ;
            menor = umaConta.getValorDaConta();
        }
        return menor;
    }

    public ArrayList<ContaDeLuz> getListaContasDeluz() {
        return listaContasDeluz;
    }

    public void setListaContasDeluz(ArrayList<ContaDeLuz> listaContasDeluz) {
        this.listaContasDeluz = listaContasDeluz;
    }

}
