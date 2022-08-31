package introducao;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import introducao.Exercicio1.*;

public class app4 {
    public static void main(String[] args) {
        


        Livro livro1 = new Livro("Java como programar");
        livro1.setValor(349f);
        livro1.setEsgotado(false);
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(1945,0,01);
        Autor escritor1 = new Autor("Deitel",calendario.getTime());
        livro1.setDono(escritor1);

        Livro livro2 = new Livro("UML guia do usuário");
        livro2.setValor(165f);
        livro2.setEsgotado(false);
        Calendar calendario2 = GregorianCalendar.getInstance();
        calendario2.set(1955,01,27);
        Autor escritor2 = new Autor("Grady Booch", calendario2.getTime());
        livro2.setDono(escritor2);

        Livro livro3 = new Livro("Java 2 ensino didático");
        livro3.setValor(126f);
        livro3.setEsgotado(true);
        Calendar calendario3 = GregorianCalendar.getInstance();
        calendario3.set(0,0,0);
        Autor escritor3 = new Autor("Grady Booch", calendario3.getTime());
        livro3.setDono(escritor3);
        
        
        System.out.println("LIVRO 1");
        System.out.println(livro1.getTitulo());
        System.out.println(livro1.getValor());
        System.out.println(livro1.isEsgotado());
        System.out.println(livro1.getDono());
        
        System.out.println("             ");
        System.out.println("          ");

        System.out.println("LIVRO 2");
        System.out.println(livro2.getTitulo());
        System.out.println(livro2.getValor());
        System.out.println(livro2.isEsgotado());
        System.out.println(livro2.getDono());

        System.out.println("             ");
        System.out.println("          ");

        System.out.println("LIVRO 3");
        System.out.println(livro3.getTitulo());
        System.out.println(livro3.getValor());
        System.out.println(livro3.isEsgotado());
        System.out.println(livro3.getDono());
        


    }

}
