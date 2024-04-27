import java.util.Scanner;

public class Menu{
    static Scanner in = new Scanner(System.in);
    public static void menu(Garagem g){
        int escolha;
        do {
            System.out.println("O que deseja fazer:");
            System.out.println("1 - Criar um trem;");
            System.out.println("2 - Editar um trem;");
            System.out.println("3 - Listar os trens criados;");
            System.out.println("4 - Desfazer um trem;");
            System.out.println("5 - Encerrar o programa.");
            escolha = in.nextInt();
                switch (escolha) {
                    case 1:
                        g.criaTrem();
                        break;
                    case 2:
                        menuEdita(g);
                        break;
                    case 3:
                        g.printaListaTrens();
                        break;
                    case 4:
                    
                        break;
                }
        }while (escolha!=5);
    }

    public static void menuEdita(Garagem g){
        int escolha;
        do{
        System.out.println("Qual Trem voce deseja editar?");
        System.out.println("Trens disponíveis: ");g.printaListaTrens();
        int idTrem = in.nextInt();
        Trem tremAchado = g.achaListaTrens(idTrem);
        System.out.println("O que deseja fazer com o trem escolhido?");
        System.out.println("1 - Inserir uma Locomotiva;");
        System.out.println("2 - Inserir um Vagão;");
        System.out.println("3 - Remover o Ultimo elemento do Trem;");
        System.out.println("4 - Listar Locomotivas Livres;");
        System.out.println("5 - Listar Vagões Livres;");
        System.out.println("6 - Retornar ao menu anterior.");
        escolha = in.nextInt();
            switch(escolha){
                case 1:
                g.insereLocomotivaNoTrem(tremAchado);
                    break;
                case 2:
                g.insereVagaoNoTrem(tremAchado);
                    break;
                case 3:
                g.removeUltimoElementoTrem(tremAchado);
                    break;
                case 4:
                g.printaListaLocomotivasLivres();
                    break;
                case 5:
                g.printaListaVagoesLivres();
                    break;
            }
        }while (escolha!=6); 
        menu(g);
    }

}
