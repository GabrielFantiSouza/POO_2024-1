import java.time.LocalDate;

public class Economica extends Passagem{

    public Economica(LocalDate data, int numeroVoo, double custoBase, int qntdMalas, boolean acessoPrioritario) {
        super(data, numeroVoo, custoBase * 1.10, 0, false); 
    }

    

    @Override
    public String toString() {
        return "Economica{" +
                "data=" + getLocalDate() +
                ", numeroVoo=" + getNumeroVoo() +
                ", Custo=" + getCustoBase() +
                ", qntdMalas=" + getQntdMalas() +
                ", acessoPrioritario=" + isAcessoPrioritario() +
                '}';
    }
    
}