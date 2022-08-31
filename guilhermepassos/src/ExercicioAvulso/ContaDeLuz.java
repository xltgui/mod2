package ExercicioAvulso;

import java.util.Date;

public class ContaDeLuz {
    private float valorDaConta;
    private Date dataLeitura;
    private Date dataPagamento;
    private float quantidadeKw;
    private float valorMedio;
    private int numeroLeitura;

    public ContaDeLuz(float valorDaConta, Date dataLeitura, int numeroLeitura, float quantidadeKw, float valorMedio, Date dataPagamento){
        this.valorDaConta = valorDaConta;
        this.dataLeitura = dataLeitura;
        this.numeroLeitura = numeroLeitura;
        this.quantidadeKw = quantidadeKw;
        this.valorMedio = valorMedio;
        this.dataPagamento = dataPagamento;
    }

    public int getNumeroLeitura() {
        return numeroLeitura;
    }

    public float getValorDaConta() {
        return valorDaConta;
    }

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public float getQuantidadeKw() {
        return quantidadeKw;
    }

    public float getValorMedio() {
        return valorMedio;
    }

}
