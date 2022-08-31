package introducao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import introducao.Exercicio3.Comprador;
import introducao.Exercicio3.Pedido;
import introducao.Exercicio3.Produto;
import introducao.Exercicio3.ItemPedido;

public class app6 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Comprador zezinho = new Comprador();
        zezinho.setId(300);
        zezinho.setNome("Zezinho da silva");
        zezinho.setEndereço("Rua LALALA 100");

        Pedido pedido1 = new Pedido();
        pedido1.setId(1);
        try {
            pedido1.setData(sdf.parse("29/04/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        ItemPedido item1 = new ItemPedido();
        item1.setId(1); 
        item1.setQuantidade(1);
        item1.setValorVenda(7500f);

        ItemPedido item2 = new ItemPedido();
        item2.setId(2);
        item2.setQuantidade(1);
        item2.setValorVenda(4000f);

        Produto produto1 = new Produto();
        produto1.setId(1001);
        produto1.setNome("Playstation 5");
        produto1.setValor(8000f);

        Produto produto2 = new Produto();
        produto2.setId(1002);
        produto2.setNome("Xbox Series X");
        produto2.setValor(5000f);

        pedido1.setCliente(zezinho);

        item1.setProduto(produto1);
        item2.setProduto(produto2);

        pedido1.getListagens().add(item1);
        pedido1.getListagens().add(item2);
        pedido1.calcValorTotal();

        System.out.println(pedido1);
        
        
    }
}
