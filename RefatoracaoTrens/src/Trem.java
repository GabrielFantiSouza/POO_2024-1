import java.util.ArrayList;
import java.util.Scanner;

public class Trem{
    private int idTrem;
    private ArrayList<Locomotiva> listaLocomotivasNoTrem; 
    private ArrayList<Vagao> listaVagoesNoTrem;
    public Scanner in = new Scanner(System.in);
    public Garagem g = new Garagem();

    public Trem(int idTrem, ArrayList<Locomotiva> listaLocomotivasNoTrem, ArrayList<Vagao> listaVagoesNoTrem){
        this.idTrem = idTrem;
        this.listaLocomotivasNoTrem = listaLocomotivasNoTrem;
        this.listaVagoesNoTrem = listaVagoesNoTrem;
    }

    public void criaTrem(){
        System.out.println("Digite o id do seu novo Trem:");
        int idTrem = in.nextInt();
        System.out.println("Digite o id da Locomotiva que deseja adicionar no seu trem: /n Locomotivas disponíveis");
        g.printaListaLocomotivasLivres();

    }
}