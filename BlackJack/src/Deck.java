import java.util.Random;

public class Deck {
    public final int MAX_CARTAS = 104;
    private Carta[] cartas;
    private int proxLivre;

    public Deck(){
        cartas = new Carta[MAX_CARTAS];
        proxLivre = 0;
    }

    public void insereEmCima(Carta carta){
        if(proxLivre == MAX_CARTAS){
            throw new RuntimeException("Deck cheio!");
        }
        cartas[proxLivre]= carta;
        proxLivre++;
    }

    public Carta retiraDeCima(){
        if(proxLivre == MAX_CARTAS){
            throw new RuntimeException("Deck vazio!");
        }
        proxLivre--;
        return cartas[proxLivre];
    }

    public Carta retiraDeBaixo(){
        if(proxLivre == MAX_CARTAS){
            throw new RuntimeException("Deck vazio!");
        }
        Carta aux = cartas[0];
        for(int i=0; i<proxLivre-1; i++){
            cartas[i] = cartas [i+1];
        }
        proxLivre--;
        return aux;
    }

    public int qtdadeCartas(){
        return proxLivre;
    }

    public int somaDosValores(){
        int soma = 0;
        for(int i=0; i<proxLivre; i++){
            soma += cartas[i].getValorDeUmaCarta().getValor();
        }
        return soma;
    }

    public void embaralha(){
        Random r = new Random();
        for(int i=0; i<200; i++){
        int posicao1 = r.nextInt(52);
        int posicao2 = r.nextInt(52);
        Carta aux = cartas[posicao1];
        cartas[posicao1] = cartas[posicao2];
        cartas[posicao2] = aux;
        } 
    }

}
