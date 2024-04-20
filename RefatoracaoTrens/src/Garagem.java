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

    public void printaListaTrens(){
        for (Trem Trem : listaTrens) {
            System.out.println(Trem);
        }
    }

    public void criaTrem(){
        System.out.println("Digite a ID do seu Trem: ");
        int idTrem = in.nextInt();
        System.out.println("Digite o ID da Locomotiva que deseja adicionar no trem: ");
        System.out.println("Locomotivas disponíveis: ");
        printaListaLocomotivasLivres();
        int idLocomotiva = in.nextInt();
        for(int i=0; i<listaLocomotivas.size();i++){
            if(listaLocomotivas.get(i).getIdProprio()==(idLocomotiva)){
                listaLocomotivas.get(i).setIdTremAcoplado(String.valueOf(idTrem));
                Trem t = new Trem(idTrem, listaLocomotivas.get(i), null);
                listaTrens.add(t);
                listaLocomotivas.remove(i);
                return;
            }
        }
    }
    
    public void insereVagaoNoTrem(){
        System.out.println("Digite qual Trem deseja colocar seu vagão:");
        System.out.println("Trens disponíveis:");
        printaListaTrens();
        int idTrem = in.nextInt();
        System.out.println("Digite qual vagão deseja adicionar no Trem: ");
        System.out.println("Vagões disponíveis:");
        printaListaVagoesLivres();
        int idVagao = in.nextInt();
        for(int i=0; i<listaTrens.size(); i++){
            if(listaTrens.get(i).getIdTrem()==idTrem){
                for(int j=0; j<listaVagoes.size(); j++){
                    if(listaVagoes.get(j).getIdProprio()==idVagao){
                        listaTrens.get(i).addVagaoNoTrem(listaVagoes.get(j));
                        listaVagoes.get(j).setIdTremAcoplado(String.valueOf(idTrem));
                        listaVagoes.remove(j);
                        System.out.println("Vagão adicionado no Trem de ID "+idTrem);
                    }
                }
            }
        }

    }

    public void insereLocomotivaNoTrem(){
        System.out.println("Digite qual Trem deseja colocar sua Locomotiva:");
        System.out.println("Trens disponíveis:");
        printaListaTrens();
        int idTrem = in.nextInt();
        System.out.println("Digite qual Locomotiva deseja adicionar no Trem: ");
        System.out.println("Locomotivas disponíveis:");
        printaListaLocomotivasLivres();
        int idLocomotiva = in.nextInt();
        for(int i=0; i<listaTrens.size(); i++){
            if(listaTrens.get(i).getIdTrem()==idTrem){
                if(listaTrens.get(i).getTamanhoListaVagoes()>0){
                    System.out.println("Você não pode adicionar uma Locomotiva após ter sido inserido um Vagão.");
                }else{
                    for(int j=0; j<listaLocomotivas.size(); j++){
                        if(listaLocomotivas.get(j).getIdProprio()==idLocomotiva){
                            listaTrens.get(i).addLocomotivaNoTrem(listaLocomotivas.get(j));
                            listaLocomotivas.get(j).setIdTremAcoplado(String.valueOf(idTrem));
                            listaLocomotivas.remove(j);
                            System.out.println("Locomotiva adicionada no Trem de ID "+idTrem);
                        }
                    }
                }
            }
        }
    }
}