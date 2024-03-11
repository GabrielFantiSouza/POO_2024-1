public class Deck {
    public final int MAX_CARTAS = 104;
    private Carta[] cartas;
    private int proxLivre;

    public Deck(){
        cartas = new Carta[MAX_CARTAS];
        proxLivre = 0;
    }

    public void insereEmCarta(Carta carta){

    }

    public Carta retiraDeBaixo(){
        return null;
    }

    public int qtdadeCartas(){
        return proxLivre;
    }

    public int somaDosValores(){
        return 0;
    }

    public void embaralha(){
        
    }

}
