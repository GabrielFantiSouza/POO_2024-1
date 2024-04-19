import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garagem{
    private List<Locomotiva> listaLocomotivas = new ArrayList<>();
    private List<Vagao> listaVagoes = new ArrayList<>();
    private List<Trem> listaTrens = new ArrayList<>(); 
    private Scanner in = new Scanner(System.in);

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

    public void criaTrem(){
        System.out.println("Digite a ID do seu Trem: ");
        String idTrem = in.nextLine();
        System.out.println("Digite o ID da Locomotiva que deseja adicionar no trem: ");
        System.out.println("Locomotivas disponíveis: ");
        printaListaLocomotivasLivres();
        int idLocomotiva = in.nextInt();
        for(int i=0; i<listaLocomotivas.size();i++){
            if(listaLocomotivas.get(i).getIdProprio()==Integer.parseInt(idTrem)){
                listaLocomotivas.get(i).setIdTremAcoplado(idTrem);
                Trem t = new Trem(Integer.parseInt(idTrem), listaLocomotivas.get(i), null);
                listaLocomotivas.remove(i);
            }
        }

    }

}