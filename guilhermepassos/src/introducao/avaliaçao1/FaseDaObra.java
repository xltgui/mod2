package introducao.avaliaçao1;

import java.util.ArrayList;

public class FaseDaObra {
    private String nome;

    private Engenheiro encarregado;

    private ArrayList<Construtor> listaConstrutores = new ArrayList<>();

    private ArrayList<ItemDeConstrucao> listaItens = new ArrayList<>();

    public float calcularValorDaFaseDaObra() {
        float total = 0;

        for (var umItem : this.getListaItens()) {
            total = total + umItem.getQuantidade();
            total = total * umItem.getProduto().getPreco();

            for (var umConstrutor : this.getListaConstrutores()) {
                total = umConstrutor.getSalario();
            }
            
        }
        total = total + this.getEncarregado().getSalario();

        return total;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Engenheiro getEncarregado() {
        return encarregado;
    }

    public void setEncarregado(Engenheiro encarregado) {
        this.encarregado = encarregado;
    }

    public ArrayList<Construtor> getListaConstrutores() {
        return listaConstrutores;
    }

    public void setListaConstrutores(ArrayList<Construtor> listaConstrutores) {
        this.listaConstrutores = listaConstrutores;
    }

    public ArrayList<ItemDeConstrucao> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<ItemDeConstrucao> listaItens) {
        this.listaItens = listaItens;
    }
}
