import java.util.Calendar;
import java.util.GregorianCalendar;

import ExercicioAvulso.*;

public class app10 {

    public static void main(String[]args) {
        Calendar calendario = GregorianCalendar.getInstance();

        Planilha plan1 = new Planilha();

        calendario.set(2022, 05, 24);

        ContaDeLuz conta1 = new ContaDeLuz(300f, calendario.getTime(), 1, 32, 0, calendario.getTime());

        calendario.set(2022, 05, 23);
        ContaDeLuz conta2 = new ContaDeLuz(400f, calendario.getTime(), 2, 42, 0, calendario.getTime());

        plan1.getListaContasDeluz().add(conta1);
        plan1.getListaContasDeluz().add(conta2);


    }
}
