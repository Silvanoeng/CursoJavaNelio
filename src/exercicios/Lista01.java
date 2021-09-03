package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int a, b;
        System.out.println("Digite dois valores: ");
        a = sc.nextInt();
        b= sc.nextInt();
        System.out.printf("A soma é "+ (a+b) + "%n");


        double raio, area, pi = 3.14159;
        System.out.println("Digite o raio do círculo: ");
        raio = sc.nextDouble();
        area = pi * (Math.pow(raio, 2.0));
        System.out.printf("A área do círculo tem %.4f%n", area);

        int a1, b1, c1, d, diferenca;
        System.out.println("Digite quatro valores:");
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        c1 = sc.nextInt();
        d = sc.nextInt();
        diferenca=(a1*b1-c1*d);
        System.out.println("O resultado foi: "+ diferenca);

        int funcionario, horasTrabalhadas;
        double valorHora, salario;
        System.out.println("Qual o número do funcionario? ");
        funcionario=sc.nextInt();
        System.out.println("Quantas horas ele trabalho? ");
        horasTrabalhadas=sc.nextInt();
        System.out.println("Qual o valor da hora dele? ");
        valorHora=sc.nextDouble();
        salario=horasTrabalhadas*valorHora;
        System.out.println("O funcionário: "+funcionario);
        System.out.println("Vai receber: R$ "+salario);

        int peca01, peca02, quantidade01, quantidade02;
        double valorPeca01, valorPeca02, valorTotal;
        System.out.println("Digite o código da peça, a quantidade e o valor:");
        peca01= sc.nextInt();
        quantidade01=sc.nextInt();
        valorPeca01=sc.nextDouble();
        System.out.println("Digite o código da peça, a quantidade e o valor:");
        peca02= sc.nextInt();
        quantidade02=sc.nextInt();
        valorPeca02=sc.nextDouble();
        valorTotal=quantidade01*valorPeca01+quantidade02*valorPeca02;
        System.out.printf("O valor total é: R$ %.2f%n",valorTotal);

        float a2, b2, c2, aTri, aCir, aTrap, aQuad, aRet, pi2=3.14159f;
        System.out.println("Digite três valores: ");
        a2=sc.nextFloat();
        b2=sc.nextFloat();
        c2=sc.nextFloat();
        aTri=a*c2/2;
        aCir=pi2*c2*c2;
        aTrap=((a2+b2)/2)*c2;
        aQuad=b2*b2;
        aRet=a2*b2;
        System.out.printf("Triangulo: %.3f%n",aTri);
        System.out.printf("Circulo: %.3f%n",aCir);
        System.out.printf("Trapezio: %.3f%n",aTrap);
        System.out.printf("Quadrado: %.3f%n",aQuad);
        System.out.printf("Retangulo: %.3f%n",aRet);

        sc.close();

    }
}
