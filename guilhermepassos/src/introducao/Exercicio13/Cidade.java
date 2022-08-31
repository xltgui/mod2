package introducao.Exercicio13;

import java.util.ArrayList;

public class Cidade {
    private ArrayList<Municipe> listaMunicipes = new ArrayList<>();

    private String nome;

    public ArrayList<Municipe> getListaMunicipes() {
        return listaMunicipes;
    }

    public void setListaMunicipes(ArrayList<Municipe> listaMunicipes) {
        this.listaMunicipes = listaMunicipes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Cidade cid1 = new Cidade();
        cid1.setNome("Joinville");

        Municipe mun1 = new Municipe();
        Municipe mun2 = new Municipe();
        Municipe mun3 = new Municipe();
        Municipe mun4 = new Municipe();
        Municipe mun5 = new Municipe();

        mun1.setNome("Zezinho");
        mun2.setNome("Mariazinha");
        mun3.setNome("Huguinho");
        mun4.setNome("Zezinho");
        mun5.setNome("Luizinho");

        TipoResidencia tipo1 = new TipoResidencia();
        tipo1.setNome("Apartamento");

        mun1.setTipo(tipo1);
        mun2.setTipo(tipo1);
        mun3.setTipo(tipo1);

        TipoResidencia tipo2 = new TipoResidencia();
        tipo2.setNome("Casa");

        mun4.setTipo(tipo2);
        mun5.setTipo(tipo2);

        cid1.getListaMunicipes().add(mun1);
        cid1.getListaMunicipes().add(mun2);
        cid1.getListaMunicipes().add(mun3);
        cid1.getListaMunicipes().add(mun4);
        cid1.getListaMunicipes().add(mun5);

        var ap = cid1.contaAp();
        System.out.println(ap);

        var casa = cid1.contaCasas();
        System.out.println(casa);

    }

    public int contaAp() {
        int ap = 0;

        for (var umMun : getListaMunicipes()) {
            if (umMun.getTipo().getNome().equalsIgnoreCase("apartamento")){
                ap += 1;
            }
        }

        return ap;
    }

    public int contaCasas() {
        int casas = 0;

        for (var umMun : getListaMunicipes()) {
            if (umMun.getTipo().getNome().equalsIgnoreCase("casa")){
                casas += 1;
            }
        }

        return casas;
    }
}
