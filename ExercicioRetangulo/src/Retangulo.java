import java.util.Scanner;

public class Retangulo{

    private double lado1;
    private double lado2;

    public Rentangulo(double lado1, double lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public Quadrado(double ladoigual){
        this.ladoigual=ladoigual;
    }

    public double areaRetangulo(double lado1, double lado2){
        return lado1*lado2;
    }

    public double perimetroRetangulo(double lado1, double lado2){
        return (lado1*2)+(lado2*2);
    }

    public getLado1(){
        return this.lado1;
    }

    public getlado2(){
        return this.lado2;
    }

    public menu(){
        Scanner in=new Scanner(Sysmte.in);
        System.out.println("Digite o primeiro lado do retangulo:");
        double lado1=in.nextDouble();
        System.out.println("Digite o segundo lado do retangulo:");
        double lado2=in.nextDouble();
        Retangulo retangulo = new Retangulo(lado1,lado2);
        System.out.println();
    }
}