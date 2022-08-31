import introducao.ExericioCelular.Aplicativo;
import introducao.ExericioCelular.Celular;
import introducao.ExericioCelular.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {

        Pessoa zezinho = new Pessoa("ze");

        zezinho.setNome("Zezinho da Silva Sauro");
        zezinho.setCPF("111.111.111-11");
        zezinho.setAltura(1.8f);
        zezinho.setIdade(17);
        zezinho.setRaca("A");
        System.out.println(zezinho.getNome() + "Raça: " + zezinho.getRaca());
        Pessoa.mostraRaca();

        // passagem de parâmetros
        Pessoa luizinho = new Pessoa("luiz");
        luizinho.setNome("Luizinho da Silva Sauro Jr");
        luizinho.setCPF("222.222.222-22");
        luizinho.setAltura(1.75f);
        luizinho.setIdade(21);
        luizinho.setRaca("B");
        System.out.println(luizinho.getNome() + "Raça: " + luizinho.getRaca());
        System.out.println(zezinho.getNome() + "Raça: " + zezinho.getRaca());


        System.out.println(zezinho.getNome());
        System.out.println(zezinho.getAltura() + "m");
        System.out.println(zezinho.getCPF());
        System.out.println(zezinho.getIdade());

        System.out.println(luizinho.getNome());
        System.out.println(luizinho.getAltura() + "m");
        System.out.println(luizinho.getCPF());
        System.out.println(luizinho.getIdade());

        String guardaResultado = zezinho.podeDirigir();
        System.out.println(guardaResultado);
        guardaResultado = luizinho.podeDirigir();
        System.out.println(guardaResultado);

        zezinho.mostraCPF();
        luizinho.mostraCPF();

        System.out.println();

        Celular startak = new Celular("(47) 98888-2222");
        startak.setModelo("pt 550");
        startak.setMarca("Motorola");

        startak.setDono(zezinho);

        Aplicativo app1 = new Aplicativo("Angry birds");
        Aplicativo app2 = new Aplicativo("Whatsapp");
        Aplicativo app3 = new Aplicativo("Tiktok");
        Aplicativo app4 = new Aplicativo("Instagram");

        startak.getListaAplicativos().add(app1);
        startak.getListaAplicativos().add(app2);
        startak.getListaAplicativos().add(app3);
        startak.getListaAplicativos().add(app4);

        startak.getListaAplicativos().remove(2);
        startak.getListaAplicativos().set(2, new Aplicativo("GROBOPRAY"));

        System.out.println(startak.getListaAplicativos().indexOf(app2));

        for (int i = 0; i < startak.getListaAplicativos().size(); i++) {

            System.out.println(startak.getListaAplicativos().get(i).getNome());
        }
        // for each;
        for(Aplicativo umApp:startak.getListaAplicativos()){
            System.out.println(umApp);
        }
    }
}
