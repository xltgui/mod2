package sistema.entity;

import java.util.Date;

public class Cliente {

    private long id;
    private String nome;
    private String cpf;
    private Date nascimento;

    public Cliente (){

    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public void SetNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

}
