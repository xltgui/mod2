package introducao.Exercicio6;

public class Vendedor extends Funcionario{
    private float percComissao;
    private float metaVendas;

    private EquipeDeVendas equipe;

    public EquipeDeVendas getEquipe() {
        return equipe;
    }
    public void setEquipe(EquipeDeVendas equipe) {
        this.equipe = equipe;
    }
    public float getPercComissao() {
        return percComissao;
    }
    public void setPercComissao(float percComissao) {
        this.percComissao = percComissao;
    }
    public float getMetaVendas() {
        return metaVendas;
    }
    public void setMetaVendas(float metaVendas) {
        this.metaVendas = metaVendas;
    }
    
}
