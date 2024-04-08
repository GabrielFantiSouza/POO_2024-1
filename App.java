public class App {
    public static void main(String args[]){
        ContaLimite cl = new ContaLimite(100, "Luizinho", 3000, 1500, 0.15);
        cl.retirada(3500);
        cl.deposito(1200);
        System.out.println(cl.toString());
        ContaRemunerada cr = new ContaRemunerada(120,"Lala Pato", 2500, 0.05);
        cr.deposito(4000);
        System.out.println(cr.toString());
    }
}
