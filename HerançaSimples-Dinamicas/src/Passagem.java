import java.time.LocalDate;

public class Passagem{
    private LocalDate localDate = LocalDate.now();
    private int numeroVoo;
    private double custoBase;
    private int qntdMalas;
    private boolean acessoPrioritario; 

    public Passagem(LocalDate localDate, int numeroVoo, double custoBase, int qntdMalas, boolean acessoPrioritario){
        this.localDate = localDate;
        this.numeroVoo = numeroVoo;
        this.custoBase = custoBase;
        this.qntdMalas = qntdMalas;
        this.acessoPrioritario = acessoPrioritario;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public int getNumeroVoo() {
        return numeroVoo;
    }

    public double getCustoBase() {
        return custoBase;
    }

    public int getQntdMalas() {
        return qntdMalas;
    }

    public boolean isAcessoPrioritario() {
        return acessoPrioritario;
    }

    @Override
    public String toString() {
        return "Passagem{" +
                "data=" + getLocalDate() +
                ", numeroVoo=" + getNumeroVoo() +
                ", custoBase=" + getCustoBase() +
                ", qntdMalas=" + getQntdMalas() +
                ", acessoPrioritario=" + isAcessoPrioritario() +
                '}';
    }

}