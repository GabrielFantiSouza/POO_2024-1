public class App {
    public static void imprimeCartas(Deck d){
        d.reset();
        Carta aux = null;
        while((aux=d.next())!=null){
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        Baralho b1 = new Baralho();
        b1.embaralha();
        Deck j1 = new Deck();
        Deck j2 = new Deck();
        j1.insereEmCima(b1.retiraDeCima());
        j1.insereEmCima(b1.retiraDeCima());
        j2.insereEmCima(b1.retiraDeCima());
        j2.insereEmCima(b1.retiraDeCima());
        while(true){
            System.out.println("Cartas do jogador 1: ");
            imprimeCartas(j1);
            int somaj1 = j1.somaDosValores();
            int somaj2 = j1.somaDosValores();
            System.out.println("Somatorio do Jogador 1: "+somaj1);
            System.out.println("Cartas do jogador 1: ");
            imprimeCartas(j1);
            System.out.println("Somatorio do Jogador 1: "+somaj2);
            if(somaj1 > 21){
                System.out.println("Jogador 2 ganhou!");
            }
            if(somaj2 > 21){
                System.out.println("Jogador 1 ganhou!");
            }
            if(somaj1 == 21){
                System.out.println("Jogador1 ganhou!");
            }
            if(somaj2 == 21){
                System.out.println("Jogador2 ganhou!");
            }
            break;
            // Testar se alguem quer mais 1 carta
            //Pergunta quem quer mais uma carta
        }
    }
}
