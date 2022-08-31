package introducao.Exercicio3;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
    private long id;
    private Date data;
    private Comprador cliente;
    private ArrayList<ItemPedido> listagens = new ArrayList<>();

    public Comprador getCliente() {
        return cliente;
    }

    public void setCliente(Comprador cliente) {
        this.cliente = cliente;
    }


    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<ItemPedido> getListagens() {
        return listagens;
    }

    public void setListagens(ArrayList<ItemPedido> listagens) {
        this.listagens = listagens;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    float valorTotal;

    public float calcValorTotal() {

        for (int i = 0; i < getListagens().size(); i++) {
            StringBuilder montadorString = new StringBuilder();
            ItemPedido quant = listagens.get(i);

                montadorString.append(quant.getQuantidade());
            montadorString.append(quant.getValorVenda());

            valorTotal += quant.getValorVenda() * quant.getQuantidade();

        }
        return valorTotal;
    }

    public String toString() {
        StringBuilder montadorString = new StringBuilder();
        for (int i = 0; i < getListagens().size(); i++) {
            ItemPedido itemPedido = listagens.get(i);
            

            montadorString.append("\n" + "Pedido - id: " + getId());
            montadorString.append("\n" + "Produto: " + itemPedido.getProduto().getNome());
            montadorString.append("\n" + "Produto - id: " + itemPedido.getProduto().getId());
            montadorString.append("\n" + "Produto - Valor bruto: R$" + itemPedido.getProduto().getValor());

            montadorString.append("\n" + "Quantidade: " + itemPedido.getQuantidade());
            montadorString.append("\n" + "Valor venda: " + itemPedido.getValorVenda());
            
            montadorString.append("\n" + "Cliente - nome: " + getCliente().getNome());
            montadorString.append("\n" + "Cliente - endereço: " + getCliente().getEndereço());
            montadorString.append("\n" + "Cliente - id: " + getCliente().getId());;

            montadorString.append("\n" + "Valor total: " + valorTotal);
        }
        

        return montadorString.toString(); 
    }
}
