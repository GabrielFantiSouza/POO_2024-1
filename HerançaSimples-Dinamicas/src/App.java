import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Passagem p = new Passagem(LocalDate.now(), 10, 100, -1, false);
        Economica economica = new Economica(LocalDate.now(), 10, 100, 0, false);
        Executiva executiva = new Executiva(LocalDate.now(), 10, 100, 1, false);
        PrimeiraClasse primeiraClasse = new PrimeiraClasse(LocalDate.now(), 10, 100, 3, true);
        System.out.println("Passagem Base = "+p);
        System.out.println("Passagem Economica = "+economica);
        System.out.println("Passagem Executiva = "+executiva);
        System.out.println("Passagem Primeira Classe = "+primeiraClasse);
    }
}
