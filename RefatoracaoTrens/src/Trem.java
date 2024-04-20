import java.util.ArrayList;
import java.util.Scanner;

public class Trem{
    private int idTrem;
    private ArrayList<Locomotiva> listaLocomotivasNoTrem; 
    private ArrayList<Vagao> listaVagoesNoTrem;
    private Locomotiva locomotiva;
    private Vagao vagao;
    public Scanner in = new Scanner(System.in);
    
    public Trem(int idTrem, Locomotiva locomotiva, Vagao vagao) {
        this.idTrem = idTrem;
        this.listaLocomotivasNoTrem = new ArrayList<>();
        this.listaVagoesNoTrem = new ArrayList<>();
        this.locomotiva = locomotiva;
        this.vagao = vagao;
        this.listaLocomotivasNoTrem.add(locomotiva);
    }

    public int getIdTrem(){
        return this.idTrem;
    }

    public void addLocomotivaNoTrem(Locomotiva locomotiva){
        listaLocomotivasNoTrem.add(locomotiva);
    }

    public void addVagaoNoTrem(Vagao vagao){
        listaVagoesNoTrem.add(vagao);
    }

    public int getTamanhoListaVagoes(){
        return listaVagoesNoTrem.size();
    }

    @Override
    public String toString() {
        return "Trem [idTrem=" + idTrem + ", listaLocomotivasNoTrem=" + listaLocomotivasNoTrem + ", listaVagoesNoTrem="
                + listaVagoesNoTrem + "]";
    }

}