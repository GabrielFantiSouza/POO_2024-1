public class App {
    public static void main(String[] args) throws Exception {
        Carta c = new Carta(Valor.DAMA,Naipe.OUROS);
        System.out.println(c.getValor().toString());
        System.out.println(c.getValor().getValor());
    }
}