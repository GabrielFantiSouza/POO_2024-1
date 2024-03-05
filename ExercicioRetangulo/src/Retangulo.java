import java.util.Scanner;

public class Retangulo{

    private double lado1;
    private double lado2;

    public Retangulo(){

    }

    public Retangulo(double lado1, double lado2){ //construtor do retangulo
        this.lado1=lado1;
        this.lado2=lado2;
        }

    public Retangulo(double lado1){ //construtor do quadrado
        this.lado1 = lado1;
    }

    public double areaRetangulo(double lado1, double lado2){//calcula a area
        return lado1*lado2;
    }

    public double areaQuadrado(double lado1){//calcula a area
        return lado1*lado1;
    }

    public double perimetroRetangulo(double lado1, double lado2){//calcula o perimetro
        return (lado1*2)+(lado2*2);
    }

    public double perimetroQuadrado(double lado1){//calcula o perimetro
        return lado1*4;
    }

    public double getLado1(){//fornece o lado 1
        return lado1;
    }

    public double getlado2(){//fornece o lado 2
        return lado2;
    }

    public void menu(){//menu de inicialização do app
        Scanner in=new Scanner(System.in);
        System.out.println("Digite o primeiro lado do retangulo:");
        double lado1=in.nextDouble();
        System.out.println("Digite o segundo lado do retangulo:");
        double lado2=in.nextDouble();
        Retangulo retangulo;
        retangulo = new Retangulo(lado1,lado2); 
            if(retangulo.lado1==retangulo.lado2){
                retangulo = new Retangulo(lado1);
                System.out.println("Você criou um quadrado de lado "+retangulo.getLado1());
                System.out.println("Sua área é "+areaQuadrado(lado1)+" e seu perímetro é "+perimetroQuadrado(lado1));
            }else{
                System.out.println("Você criou um retangulo de lados "+retangulo.getLado1()+" e "+retangulo.getlado2());
                System.out.println("Sua área é "+areaRetangulo(lado1, lado2)+" e seu perímetro é "+perimetroRetangulo(lado1, lado2));
            }
    }
}