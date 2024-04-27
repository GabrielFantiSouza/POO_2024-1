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
                Trem t = new Trem(idTrem, listaLocomotivas.get(i));
                listaTrens.add(t);
                listaLocomotivas.remove(i);
                return;
            }
        }
    }
    
    public void insereVagaoNoTrem(Trem trem){
        int idTrem = trem.getIdTrem();
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

    public void insereLocomotivaNoTrem(Trem trem){
        int idTrem = trem.getIdTrem();
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

    public void removeUltimoElementoTrem(Trem trem){
        int idTrem = trem.getIdTrem();
        for(int i=0; i<listaTrens.size(); i++){
            if(listaTrens.get(i).getIdTrem()==idTrem){
                if(listaTrens.get(i).getTamanhoListaVagoes()>0){
                    listaVagoes.add(listaTrens.get(i).getVagaoPorIndice(listaTrens.get(i).getTamanhoListaVagoes()));
                    listaVagoes.get(listaVagoes.size()).setIdTremAcoplado(null);
                    listaTrens.get(i).getListaVagoesNoTrem().remove(trem.getTamanhoListaVagoes());
                    System.out.println("Ultimo elemento removido do Trem, era um vagão!");
                }else{
                    listaLocomotivas.add(listaTrens.get(i).getLocomotivaPorIndice(listaTrens.get(i).getTamanhoListaLocomotivas()));
                    listaTrens.get(i).getLocomotivaPorIndice(listaLocomotivas.size()).setIdTremAcoplado(null);
                    listaTrens.get(i).getListaLocomotivasNoTrem().remove(trem.getTamanhoListaLocomotivas());
                    System.out.println("Ultimo elemento removido do Trem, era uma locomotiva!");                   
                }
            }
        return;
        }
    }
    
    public Trem achaListaTrens(int idTrem){
        for(int i=0; i<listaTrens.size(); i++){
            if(listaTrens.get(i).getIdTrem()==idTrem){
                return listaTrens.get(i);
            }
        }
        return null;
    }

}