package introducao.Exercicio10;

import java.util.ArrayList;

public class Pedido {
    public static void main(String[] args){
        Produto prod1 = new Produto();
        prod1.setNome("banana");
        prod1.setValor(3.5f);

        Produto prod2 = new Produto();
        prod2.setNome("laranja");
        prod2.setValor(2.2f);

        Produto prod3 = new Produto();
        prod3.setNome("Maçã");
        prod3.setValor(7.2f);

        Produto prod4 = new Produto();
        prod4.setNome("Pêra");
        prod4.setValor(25f);

        Pedido pedido1 = new Pedido();

        pedido1.getListaProdutos().add(prod1);
        pedido1.getListaProdutos().add(prod2);
        pedido1.getListaProdutos().add(prod3);
        pedido1.getListaProdutos().add(prod4);

        var x = pedido1.calcSomaProdutos();
        System.out.println(x);
    }

    private ArrayList<Produto> listaProdutos = new ArrayList<>();

    public float calcSomaProdutos(){
        float total = 0;
        for(var umProduto : this.getListaProdutos()){
            total = total + umProduto.getValor();
        }

        return total;
    }
    

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(ArrayList<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}

