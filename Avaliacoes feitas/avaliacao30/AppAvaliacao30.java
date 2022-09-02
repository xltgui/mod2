package introducao.avaliacao30;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppAvaliacao30 {
    public static void main(String[]args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Pet pet1 = new Pet();
        pet1.setNome("Lulu");
        pet1.setDataNascimento(sdf.parse("01/12/2015"));
        
        Vacina vac1 = new Vacina();
        vac1.setNome("Gripe Canina");
        vac1.setDataAplicacao(sdf.parse("01/06/2022"));


        Vacina vac2 = new Vacina();
        vac2.setNome("Anti-Rabica");
        vac2.setDataAplicacao(sdf.parse("01/07/2022"));

        Procedimento proc1 = new Procedimento();
        proc1.setNome("Banho");
        proc1.setValor(120f);

        Procedimento proc2 = new Procedimento();
        proc2.setNome("Tosa");
        proc2.setValor(250f);

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Zezinho");
        pessoa1.setTelefone("(47)921037826");

        pet1.setDono(pessoa1);
        
        pet1.getListaDeVacinas().add(vac1);
        pet1.getListaDeVacinas().add(vac2);

        pet1.getListaDeProcedimentos().add(proc1);
        pet1.getListaDeProcedimentos().add(proc2);

        Pet pet2 = new Pet();
        pet2.setNome("Precioso");
        pet2.setDataNascimento(sdf.parse("01/12/2018"));

        Vacina vac3 = new Vacina();
        vac3.setNome("Gripe Canina");
        vac3.setDataAplicacao(sdf.parse("01/06/2022"));

        Procedimento proc3 = new Procedimento();
        proc3.setNome("Banho");
        proc3.setValor(90f);

        Procedimento proc4 = new Procedimento();
        proc4.setNome("Tosa");
        proc4.setValor(150f);

        Procedimento proc5 = new Procedimento();
        proc5.setNome("Hospedagem");
        proc5.setValor(600f);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Luizinho");
        pessoa2.setTelefone("(51)989209876");

        pet2.setDono(pessoa2);
        
        pet2.getListaDeVacinas().add(vac3);
        
        pet2.getListaDeProcedimentos().add(proc3);
        pet2.getListaDeProcedimentos().add(proc4);
        pet2.getListaDeProcedimentos().add(proc5);
        
        var a = pet1.gerarHistoricoMedico();
        System.out.println("Histórico médico de "  + pet1.getNome() + ":" + a);  
        System.out.println("    ");
        var x = pet1.somarValoresProcedimentos();
        System.out.println("Valor total dos procidementos de " + pet1.getNome() + ":" + " $RS " + x);

        System.out.println("\n");
        var b = pet2.gerarHistoricoMedico();
        System.out.println("Histórico médico de " + pet2.getNome() + ":" + b);
        
        System.out.println("   ");
        var y = pet2.somarValoresProcedimentos();
        System.out.println("Valor total dos procedimentos de " + pet2.getNome() + ":" + " $RS " + y);
    } 
}
