package introducao.Exercicio18;

import java.util.ArrayList;

public class Loja {
    private ArrayList<Setor> listaSetores = new ArrayList<>();

    public ArrayList<Setor> getListaSetores() {
        return listaSetores;
    }

    public void setListaSetores(ArrayList<Setor> listaSetores) {
        this.listaSetores = listaSetores;
    }

    public static void main(String[] args) {
        Loja loja1 = new Loja();

        Setor setor1 = new Setor();
        setor1.setNome("Cama");

        Setor setor2 = new Setor();
        setor2.setNome("Mesa");

        Setor setor3 = new Setor();
        setor3.setNome("Banho");

        Produto p1 = new Produto();
        p1.setNome("Travesseiro");
        p1.setPreco(70f);

        Produto p2 = new Produto();
        p2.setNome("Cobertor");
        p2.setPreco(250f);

        Produto p3 = new Produto();
        p3.setNome("Toalha");
        p3.setPreco(100f);

        Produto p4 = new Produto();
        p4.setNome("Toalha de banho");
        p4.setPreco(60f);

        Produto p5 = new Produto();
        p5.setNome("Toalha de rosto");
        p5.setPreco(30f);

        Fornecedor forn1 = new Fornecedor();
        forn1.setNome("Karsten");

        Fornecedor forn2 = new Fornecedor();
        forn2.setNome("Dohler");

        p1.setFornecedor(forn1);
        p2.setFornecedor(forn1);
        p3.setFornecedor(forn1);

        p4.setFornecedor(forn2);
        p5.setFornecedor(forn2);

        setor1.getListaProdutos().add(p1);
        setor1.getListaProdutos().add(p2);

        setor2.getListaProdutos().add(p3);

        setor3.getListaProdutos().add(p4);
        setor3.getListaProdutos().add(p5);

        loja1.getListaSetores().add(setor1);
        loja1.getListaSetores().add(setor2);
        loja1.getListaSetores().add(setor3);

        var x = loja1.gerarCatalogo();
        System.out.println(x);
    }

    public String gerarCatalogo() {
        StringBuilder x = new StringBuilder();
        for (var umSetor : getListaSetores()) {
            x.append("\nSetor: " + umSetor.getNome());
            x.append("\n");
            for (var umProduto : umSetor.getListaProdutos()) {
                x.append("\nProduto: " + umProduto.getNome());
                x.append("\nPreço: " + umProduto.getPreco());
                x.append("\nFornecedor: " + umProduto.getFornecedor().getNome());
                x.append("\n");
                x.append("\n");
            }

        }
        return x.toString();
    }
}
