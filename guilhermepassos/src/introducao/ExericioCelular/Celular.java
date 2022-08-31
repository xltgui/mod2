package introducao.ExericioCelular;

import java.util.ArrayList;

// POJO - Plain old java object;
public class Celular {
    private String numero;
    private String marca;
    private String modelo;
    private Pessoa dono;

    // Opedador DIAMANTE - GENERICS.
    public ArrayList<Aplicativo> listaAplicativos = new ArrayList<>();

    public ArrayList<Aplicativo> getListaAplicativos(){
        return listaAplicativos;
    }
    public void setListaAplicativos(ArrayList<Aplicativo> listaAplicativos){
        this.listaAplicativos = listaAplicativos;
    }

    public Celular(String numero) {
        System.out.println("construtor: " + numero);
        this.numero = numero;
    }

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public Pessoa getDono(){
        return dono;
    }
    public void setDono(Pessoa dono){
        this.dono = dono;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
