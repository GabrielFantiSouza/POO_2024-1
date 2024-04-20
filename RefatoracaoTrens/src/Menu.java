import java.util.Scanner;

public class Menu{
    public static void menu(){
        Scanner in = new Scanner(System.in);
        System.out.println("O que deseja fazer:");
        System.out.println("1 - Criar um trem;");
        System.out.println("2 - Editar um trem;");
        System.out.println("3 - Listar os trens criados;");
        System.out.println("4 - Desfazer um trem;");
        System.out.println("5 - Encerrar o programa.");
        int escolha = in.nextInt();
        while (escolha!=5) {
            switch (escolha) {
                case 1:
                  
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            }
        }
    }

}
