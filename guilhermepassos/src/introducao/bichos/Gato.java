package introducao.bichos;

public class Gato extends Mamifero{
    private String nome;

    public Gato(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
