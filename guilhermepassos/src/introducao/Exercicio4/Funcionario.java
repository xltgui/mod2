package introducao.Exercicio4;

public class Funcionario extends PessoaFisica{
    private String cargo;
    private int id;

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String toString(){
        StringBuilder montadorString = new StringBuilder();
        montadorString.append("\nNome: " + getNome());
        montadorString.append("\nTelefone: " + getTelefone());
        montadorString.append("\nCPF: " + getCPF());
        montadorString.append("\nData de nascimento: " + getDataNascimento());
        montadorString.append("\nCargo: " + getCargo());
        montadorString.append("\nId " + getId());

        return montadorString.toString();
    }
    
}
