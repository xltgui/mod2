package introducao.Exercicio6;


import java.util.ArrayList;

public class EquipeDeVendas {
    private Gerente gestor;

    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();

    public String listarEquipe(){
        StringBuilder montadorStrings = new StringBuilder();
        montadorStrings.append("Gerente\n");
       // montadorStrings.append("Nome:  %s \n", this.getGestor().getNome());
        montadorStrings.append(String.format("Nome: %s \n", this.getGestor().getNome()));
        montadorStrings.append(String.format("Setor: %s \n", this.getGestor().getSetor()));
        montadorStrings.append(String.format("Telefone %s \n", this.getGestor().getTelefone()));
        montadorStrings.append(String.format("Id: %s \n", this.getGestor().getId()));

        for(var umVendedor : this.getListaVendedores()){
            montadorStrings.append("Vendedores\n");
            montadorStrings.append(String.format("Id: %s \n", umVendedor.getId()));
            montadorStrings.append(String.format("Nome: %s \n", umVendedor.getNome()));
            montadorStrings.append(String.format("Telefone: %s \n", umVendedor.getTelefone()));
            montadorStrings.append(String.format("Meta Venda: %f \n", umVendedor.getMetaVendas()));
            montadorStrings.append(String.format("Comissão: %f \n", umVendedor.getPercComissao()));

            var valComissao = (umVendedor.getMetaVendas() * umVendedor.getPercComissao()) / 100f;
            montadorStrings.append(String.format("Val comissão: %f \n", valComissao));
        }


        return montadorStrings.toString();
    }

    public ArrayList<Vendedor> getListaVendedores() {
        return listaVendedores;
    }

    public void setListaVendedores(ArrayList<Vendedor> listaVendedores) {
        this.listaVendedores = listaVendedores;
    }

    public Gerente getGestor() {
        return gestor;
    }

    public void setGestor(Gerente gestor) {
        this.gestor = gestor;
    }
}
