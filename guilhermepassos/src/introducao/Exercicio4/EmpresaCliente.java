package introducao.Exercicio4;

public class EmpresaCliente extends PessoaJuridica {
    private String sigla;
    private String UF;

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getUf() {
        return UF;
    }

    public void setUf(String UF) {
        this.UF = UF;
    }
    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("\nEmpresa - Unidade Federativa: " + getUf());
        montadorString.append("\nEmpresa - Sigla: " + getSigla());
        montadorString.append("\nEmpresa - CNPJ: " + getCNPJ());
        montadorString.append("\nEmpresa - Data de criação: " + getDataCriacao());

        return montadorString.toString();
    }
    

}
