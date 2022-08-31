package introducao.Exercicio2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class Reserva {
    private int numero;
    private Date dataInicial;
    private Date Final;
    private Quarto quarto;
    


    private ArrayList<Hospede> listaDeHospedes = new ArrayList<>();

    public ArrayList<Hospede> getListaDeHospedes(){
        return listaDeHospedes;
    }
    public void setListaDeHospedes(ArrayList<Hospede> listaDeHospedes){
        this.listaDeHospedes = listaDeHospedes;
    }
    
    
    

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Reserva(int numero){
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getFinal() {
        return Final;
    }

    public void setFinal(Date final1) {
        Final = final1;
    }
    
    public String listagemHospedes(){
        for(int i = 0; i < getListaDeHospedes().size(); i++){
            listaDeHospedes.get(i).getNome();
            listaDeHospedes.get(i).getCpf();
            listaDeHospedes.get(i).getTelefone();

        }
        String lista = listaDeHospedes.toString();
        return lista;
    }


    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        StringBuilder montadorString = new StringBuilder();

        montadorString.append("Reserva: " + numero);
        //montadorString.append(String.format("Reserva: %d", numero));

        montadorString.append("\n" + "Data inicial: " + sdf.format(dataInicial));
        montadorString.append("\n" + "Data final: " + sdf.format(Final));
        montadorString.append("\n" + "Quarto: " + quarto.getNumero());

        for(int i = 0; i < listaDeHospedes.size(); i ++){
            Hospede umHospede = listaDeHospedes.get(i);
            montadorString.append("\n" + "Hospede - Nome: " + umHospede.getNome());
            montadorString.append("\n" + "Hospede - Telefone " + umHospede.getTelefone());
            montadorString.append("\n" + "Hospede - CPF " + umHospede.getCpf());

            /*FOR EACH
        for(Hospede umHospede : listaHospedes){
            montadorString.append("\nHospede - Nome: " + umHospede.getNome());
            montadorString.append("\nHospede - Telefone: " + umHospede.getTelefone());
            montadorString.append("\nHospede - CPF: " + umHospede.getCPF());
        }
        */
        }
        return montadorString.toString();
    } 

    
    
    
}
