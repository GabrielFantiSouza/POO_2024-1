import java.util.ArrayList;
import java.util.Scanner;

public class Trem{
    private int idTrem;
    private ArrayList<Locomotiva> listaLocomotivasNoTrem; 
    private ArrayList<Vagao> listaVagoesNoTrem;
    private Locomotiva locomotiva;
    private Vagao vagao;
    public Scanner in = new Scanner(System.in);
    public Garagem g = new Garagem();

    public Trem(int idTrem, Locomotiva locomotiva, Vagao vagao){
        this.idTrem = idTrem;
        this.listaLocomotivasNoTrem = listaLocomotivasNoTrem;
        this.listaVagoesNoTrem = listaVagoesNoTrem;
        this.locomotiva = locomotiva;
        listaLocomotivasNoTrem.add(locomotiva);
        this.vagao = vagao;
    }

}