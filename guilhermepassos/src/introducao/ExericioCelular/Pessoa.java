package introducao.ExericioCelular;

public class Pessoa {
    // Encapsulamento -- POJO (plain old java object) = proteger/esconder os
    // detalhes do objeto;
    // atributos (variaveis)
    private String nome;
    private int idade;
    private String CPF;
    private float altura;
    private static String raca;

    public static void mostraRaca(){
        System.out.println(raca);
    }

    // Getter e Setter
    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void setNome(String nome) {
        if(!nome.equals(""));
        this.nome = nome;

    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // comportamento
    // CONSTRUTOR - serve para inicializar um objeto, e definir valores
    // obrigatórios.
    public Pessoa(String nome) {
        System.out.println("construtor" + nome);
        //this.nome = nome;
        setNome(nome);
    }

    // metodo (função)
    // modificador de acesso(public) tipoderetorno(STRING,) nome do
    // método(parâmetros) { corpo }
    public String podeDirigir() {
        if (this.idade >= 18) { /// this opcional nesse caso.
            return "Pode dirigir";
        } else {
            return "Não pode dirigir";
        }

    }

    public void mostraCPF() {
        System.out.println(this.CPF);
    }

}
