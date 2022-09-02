package introducao.avaliacao30;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Pet {
    private String nome;
    private Date dataNascimento;

    private ArrayList<Vacina> listaDeVacinas = new ArrayList<>();

    private ArrayList<Procedimento> listaDeProcedimentos = new ArrayList<>();

    private Pessoa dono;
    

    

    public String gerarHistoricoMedico(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        StringBuilder x = new StringBuilder();
        x.append("\nNome do pet: " + this.getNome());
        x.append("\nData de nascimento: " + sdf.format(this.getDataNascimento()));
        x.append("\nNome do dono: " + this.dono.getNome());
        x.append("\nTelefone do dono: " + this.dono.getTelefone());
        for(var umaVacina : this.getListaDeVacinas()){
            x.append("\nVacina: " + umaVacina.getNome());
            x.append("\nData de vacinação: " +  sdf.format(umaVacina.getDataAplicacao()));
        }

        x.append("       ");

        for(var umProc : this.getListaDeProcedimentos()){
    
            x.append("\nProcedimento:  " + umProc.getNome());
            x.append("\nValor: " + " $RS " + umProc.getValor());
        }
        
        return x.toString();
    }

    public float somarValoresProcedimentos(){
        float total = 0;
        
        for(var umProc : this.getListaDeProcedimentos()){
            total = total + umProc.getValor();
        }
        return total;
    }






    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ArrayList<Vacina> getListaDeVacinas() {
        return listaDeVacinas;
    }

    public void setListaDeVacinas(ArrayList<Vacina> listaDeVacinas) {
        this.listaDeVacinas = listaDeVacinas;
    }

    public ArrayList<Procedimento> getListaDeProcedimentos() {
        return listaDeProcedimentos;
    }

    public void setListaDeProcedimentos(ArrayList<Procedimento> listaDeProcedimentos) {
        this.listaDeProcedimentos = listaDeProcedimentos;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }
}
