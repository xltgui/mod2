package introducao.Exercicio16;

import java.util.ArrayList;

public class GuardaVolumes {
    private ArrayList<Item>  listaItens = new ArrayList<>();

    public static void main(String[] args){
        GuardaVolumes guarda = new GuardaVolumes();

        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();
        Item item5 = new Item();
        Item item6 = new Item();

        item1.setNome("Chave de casa");
        item2.setNome("Celular");
        item3.setNome("Chave de casa");
        item4.setNome("Celular");
        item5.setNome("Carteira");
        item6.setNome("Escova de cabelos");

        Proprietario p1 = new Proprietario();
        p1.setNome("Zezinho");
        
        Proprietario p2 = new Proprietario();
        p2.setNome("Mariazinha");

        item1.setProprietario(p1);
        item2.setProprietario(p1);

        item3.setProprietario(p2);
        item4.setProprietario(p2);
        item5.setProprietario(p2);
        item6.setProprietario(p2);

        guarda.getListaItens().add(item1);
        guarda.getListaItens().add(item2);
        guarda.getListaItens().add(item3);
        guarda.getListaItens().add(item4);
        guarda.getListaItens().add(item5);
        guarda.getListaItens().add(item6);


        var x = guarda.gerarListaItens();

        System.out.println(x);
    }

    public String gerarListaItens(){
        StringBuilder x = new StringBuilder();
        for(var umItem : getListaItens()){
            x.append("\nItem: " + umItem.getNome());
            x.append("\nProprietário: " +  umItem.getProprietario().getNome());
            x.append("\n");
        }
        return x.toString();
        
    }

    public ArrayList<Item> getListaItens() {
        return listaItens;
    }

    public void setListaItens(ArrayList<Item> listaItens) {
        this.listaItens = listaItens;
    }
}
