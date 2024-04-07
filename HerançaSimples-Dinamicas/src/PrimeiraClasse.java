import java.time.LocalDate;

public class PrimeiraClasse extends Passagem{

    public PrimeiraClasse(LocalDate data, int numeroVoo, double custoBase, int qntdMalas, boolean acessoPrioritario){
        super(data, numeroVoo, custoBase*1.95, 3, true);
    }

    @Override
    public String toString() {
        return "PrimeiraClasse{" +
                "data=" + getLocalDate() +
                ", numeroVoo=" + getNumeroVoo() +
                ", Custo=" + getCustoBase() +
                ", qntdMalas=" + getQntdMalas() +
                ", acessoPrioritario=" + isAcessoPrioritario() +
                '}';
    }
    
}