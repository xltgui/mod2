package introducao;

import introducao.Exercicio6.EquipeDeVendas;
import introducao.Exercicio6.Gerente;
import introducao.Exercicio6.Vendedor;

public class app9 {
    public static void main(String[] args){
        var vendedor1 = new Vendedor();
        vendedor1.setId(1);
        vendedor1.setNome("luquinhas");
        vendedor1.setPercComissao(2);
        vendedor1.setMetaVendas(1000);
        vendedor1.setTelefone("4552-1124");

        var vendedor2 = new Vendedor();
        vendedor2.setId(2);
        vendedor2.setNome("juquinhas");
        vendedor2.setPercComissao(1);
        vendedor2.setMetaVendas(1002);
        vendedor2.setTelefone("4551-1124");

        var vendedor3 = new Vendedor();
        vendedor3.setId(3);
        vendedor3.setNome("julia");
        vendedor3.setPercComissao(3);
        vendedor3.setMetaVendas(1003);
        vendedor3.setTelefone("4552-1524");

        var vendedor4 = new Vendedor();
        vendedor4.setId(4);
        vendedor4.setNome("vitinho");
        vendedor4.setPercComissao(4);
        vendedor4.setMetaVendas(1004);
        vendedor4.setTelefone("4532-1124");

        var vendedor5 = new Vendedor();
        vendedor5.setId(5);
        vendedor5.setNome("mariazinha");
        vendedor5.setPercComissao(5);
        vendedor5.setMetaVendas(1005);
        vendedor5.setTelefone("5552-1124");

        var g1 = new Gerente();
        g1.setNome("Jair");
        g1.setId(1);
        g1.setSetor("Diretoria");
        g1.setTelefone("0291-9082");

        var g2 = new Gerente();
        g2.setNome("Richfield");
        g2.setId(2);
        g1.setSetor("Diretoria");
        g1.setTelefone("1241-7898");

        EquipeDeVendas equipe1 = new EquipeDeVendas();

        equipe1.setGestor(g1);
        equipe1.getListaVendedores().add(vendedor1);
        vendedor1.setEquipe(equipe1);
        equipe1.getListaVendedores().add(vendedor2);
        vendedor2.setEquipe(equipe1);
        equipe1.getListaVendedores().add(vendedor3);
        vendedor3.setEquipe(equipe1);

        var retorno = equipe1.listarEquipe();
        System.out.println(retorno);


        EquipeDeVendas equipe2 = new EquipeDeVendas();
        equipe2.setGestor(g2);
        equipe2.getListaVendedores().add(vendedor4);
        vendedor4.setEquipe(equipe2);
        equipe2.getListaVendedores().add(vendedor5);
        vendedor5.setEquipe(equipe2);
        
        retorno = equipe2.listarEquipe();
        System.out.println(retorno);

    }
}
