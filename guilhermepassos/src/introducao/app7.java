package introducao;

import java.util.Calendar;
import java.util.GregorianCalendar;

import introducao.Exercicio4.EmpresaCliente;
import introducao.Exercicio4.Funcionario;
import introducao.Exercicio4.Pessoa;
import introducao.Exercicio4.PessoaFisica;
import introducao.Exercicio4.PessoaJuridica;

public class app7 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario();
        EmpresaCliente empresa1 = new EmpresaCliente();

        funcionario1.setCPF("111.111.111-11");
        funcionario1.setCargo("Contador");
        funcionario1.setId(10020);
        funcionario1.setNome("Zezinho");
        funcionario1.setTelefone("4002-8922");
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(2000,05,10);
        funcionario1.setDataNascimento(calendario.getTime());

        empresa1.setNome("ZetaCompany");
        empresa1.setSigla("ztC");
        empresa1.setCNPJ("111.111.2222-33");
        Calendar calendario2 = GregorianCalendar.getInstance();
        empresa1.setDataCriacao(calendario2.getTime());
        empresa1.setUf("SC");
        empresa1.setTelefone("9000-2000");

        //POLIMORFISMO -- POLI = VARIAS          MORFISMO = FORMAS DE EXISTIR;
        PessoaFisica pessoa1 = funcionario1;
        System.out.println("pessoa 1 - " );
        System.out.println("Data de nascimento: " + pessoa1.getDataNascimento());
        System.out.println("Cpf: " + pessoa1.getCPF());
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Telefone: " + pessoa1.getTelefone());

        System.out.println("\n");

        PessoaJuridica pessoa2 = empresa1;
        System.out.println("Pessoa 2 - ");
        System.out.println("Nome: " + pessoa2.getNome());
        System.out.println("CNPJ: " + pessoa2.getCNPJ());
        System.out.println("Data de criação: " + pessoa2.getDataCriacao());
        System.out.println("Telefone: " + pessoa2.getTelefone());
        
        System.out.println("\n");

        Pessoa pessoa3 = pessoa1;
        System.out.println("Pessoa 3 - ");
        System.out.println("Nome: " + pessoa3.getNome());
        System.out.println("Telefone: " + pessoa3.getTelefone());
        
        System.out.println("\n");

        Pessoa pessoa4 = pessoa2;
        System.out.println("Pessoa 4 - ");
        System.out.println("Nome: " + pessoa4.getNome());
        System.out.println("Telefone: " + pessoa4.getTelefone());

        System.out.println("\n");
        
        Funcionario funcionario2 = (Funcionario)pessoa3;
        System.out.println("Funcionario 2 - ");
        System.out.println("Cpf: " + funcionario2.getCPF());
        System.out.println("Cargo: " + funcionario2.getCargo());
        System.out.println("Id: " + funcionario2.getId());
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Telefone: " + funcionario2.getTelefone());
        System.out.println("Data de nascimento: " + funcionario2.getDataNascimento());

        System.out.println("\n");
        
        EmpresaCliente empresa2 = (EmpresaCliente)pessoa4;
        System.out.println("Empresa 2 - ");
        System.out.println("CNPJ: " + empresa2.getCNPJ());
        System.out.println("Nome: " + empresa2.getNome());
        System.out.println("Sigla: " + empresa2.getSigla());
        System.out.println("Telefone: " + empresa2.getTelefone());
        System.out.println("Unidade Federativa: " + empresa2.getUf());
        System.out.println("Data de criação: "  + empresa2.getDataCriacao());



        




    

    }
}
