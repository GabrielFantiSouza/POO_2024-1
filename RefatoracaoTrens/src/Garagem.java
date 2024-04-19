import java.util.ArrayList;
import java.util.List;

public class Garagem{
    private List<Locomotiva> listaLocomotivas = new ArrayList<>();
    private List<Vagao> listaVagoes = new ArrayList<>();
    private List<Trem> listaTrens = new ArrayList<>(); 

    public void insereNaListaLocomotiva(Locomotiva locomotiva){
        listaLocomotivas.add(locomotiva);
    }
    
    public void insereNaListaVagoes(Vagao vagao){
        listaVagoes.add(vagao);
    }

    public void insereNaListaTrens(Trem trem){
        listaTrens.add(trem);
    }
    
    public void printaListaLocomotivasLivres(){
        for (Locomotiva Locomotiva : listaLocomotivas) {
            System.out.println(Locomotiva);
        }
    }

    public void printaListaVagoesLivres(){
        for (Vagao Vagao : listaVagoes) {
            System.out.println(Vagao);
        }
    }
}