import java.time.LocalDate;

public class Executiva extends Passagem{

    public Executiva(LocalDate data, int numeroVoo, double custoBase, int qntdMalas, boolean acessoPrioritario){
        super(data, numeroVoo, custoBase*1.30, 1, false);
    }

    @Override
    public String toString() {
        return "Executiva{" +
                "data=" + getLocalDate() +
                ", numeroVoo=" + getNumeroVoo() +
                ", Custo=" + getCustoBase() +
                ", qntdMalas=" + getQntdMalas() +
                ", acessoPrioritario=" + isAcessoPrioritario() +
                '}';
    }
    
}