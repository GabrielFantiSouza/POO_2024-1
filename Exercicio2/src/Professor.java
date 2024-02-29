import java.util.Scanner;

public class Professor {
    Scanner numeros = new Scanner(System.in);
    Scanner frases = new Scanner(System.in);
    private String nome;
    private int anosExperiencia;

    Professor[] listaprofessores=new Professor[6];

    public Professor(String nome, int anosExperiencia) {
        this.nome = nome;
        this.anosExperiencia = anosExperiencia;
    }

    public String getNome() {
        return nome;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String classifica(){
        // Nova sintaxe do Java 14-15 em diante
        return switch(anosExperiencia){
            case 0,1,2,3,4,5 -> "Assistente";
            case 6,7,8,9,10 -> "Adjunto";
            default -> "Titular";
        };
    }

    @Override
    public String toString() {
        return "Professor: " + nome + ", anos de experiencia:" + anosExperiencia;
    }

    public void menu(){
        System.out.println("Deseja fazer o que?");
        System.out.println("1 - Cadastrar novo professor;");
        System.out.println("2 - Visualizar lista de professores;");
        System.out.println("3 - Ver classificação de um professor;");
        System.out.println("4 ou outro número - Encerrar o programa.");
        int escolha = numeros.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Digite o nome do professor:");
                String nome=frases.nextLine();
                System.out.println("Digite quantos anos de experiência possui o professor: ");
                int anosExperiencia=numeros.nextInt();
                Professor novo=new Professor(nome, anosExperiencia);;
                addProfessor(novo);
                menu();
                break;
            
            case 2:
                for(int i=0;i<listaprofessores.length;i++){
                    if(listaprofessores[i]!=null){
                        System.out.println(listaprofessores[i]);
                    }
                }
                menu();
                break;
            
            case 3:
                System.out.println("Digite o nome do Professor que deseja ver a Classificação:");
                String prof=frases.nextLine();
                verificaProfessor(prof);
                menu();
                break;
            
            default:
                break;
        }
        
    }

    public void verificaProfessor (String nome){
        for(int i=0;i<listaprofessores.length-1;i++){
            if(listaprofessores[i]!=null){
                if(nome.equals(listaprofessores[i].getNome())){
                    System.out.println(listaprofessores[i].classifica());
                }
            }
        }
    }

    public void addProfessor(Professor professor){
        if(listaprofessores[listaprofessores.length-1]!=null){
            System.out.println("Não foi possível adicionar o professor, lista cheia.");
        }else{
            for(int i=0;i<listaprofessores.length;i++){
                if(listaprofessores[i]==null){
                    listaprofessores[i]=professor;
                    System.out.println("Professor adicionado com sucesso!");
                    return;
                }
            }
        }
    }
}