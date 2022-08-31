package introducao.Exercicio1;


public class Livro {
    private String titulo;
    private float valor;
    private boolean esgotado;
    private Autor dono;


    public Autor getDono() {
        return dono;
    }

    public void setDono(Autor dono) {
        this.dono = dono;
    }

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public boolean isEsgotado() {
        return esgotado;
    }

    public void setEsgotado(boolean esgotado) {
        this.esgotado = esgotado;
    }

    public String toString(){
        return titulo + valor + esgotado;
    }

    

}
