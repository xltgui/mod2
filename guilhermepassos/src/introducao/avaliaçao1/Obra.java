package introducao.avaliaçao1;

import java.util.ArrayList;

public class Obra {

    private ArrayList<FaseDaObra> listaFases = new ArrayList<>();

    public String listarDadosDaObra() {
        StringBuilder mString = new StringBuilder();
        for (var umaFase : this.getListaFases()) {
            mString.append("\nNome da fase: " + umaFase.getNome());
            mString.append("\nNome do encarregado: " + umaFase.getEncarregado().getNome());
            mString.append("\nNumero do encarregado: " + umaFase.getEncarregado().getNumero());
            mString.append("\nFormação do encarregado: " + umaFase.getEncarregado().getFormacao());
            mString.append("\nSalário do encarregado: " + "R$ " + umaFase.getEncarregado().getSalario());

            for (var umConstrutor : umaFase.getListaConstrutores()) {
                mString.append("\nNome do Construtor: " + umConstrutor.getNome());
                mString.append("\nNumero do Construtor: " + umConstrutor.getNumero());
                mString.append("\nSalario do construtor: " + "R$ " + umConstrutor.getSalario());
                mString.append("\nConstrutor terceirizado ou não " + umConstrutor.isTerceirizado());

                for (var umItem : umaFase.getListaItens()) {
                    mString.append("\nNome do produto: " + umItem.getProduto().getNome());
                    mString.append("\nQuantidade: " + umItem.getQuantidade());
                    mString.append("\nPreço do produto: " + "R$ " + umItem.getProduto().getPreco());
                }
            }
        }

        return mString.toString();
    }

    public float calcularValorTotalDaObra() {
        float total = 0;
        for (var umaFase : this.getListaFases()) {
            total = total + umaFase.getEncarregado().getSalario();

            for (var umConstrutor : umaFase.getListaConstrutores()) {

                total = total + umConstrutor.getSalario();
                for (var umItem : umaFase.getListaItens()) {
                    total = total + (umItem.getQuantidade() * umItem.getProduto().getPreco());

                }

            }

        }

        return total;
    }

    public ArrayList<FaseDaObra> getListaFases() {
        return listaFases;
    }

    public void setListaFases(ArrayList<FaseDaObra> listaFases) {
        this.listaFases = listaFases;
    }

}
