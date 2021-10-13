package Aula64.src.aula99;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tamanho da matriz: ");
        int n = sc.nextInt();
        int [][] matriz = new int[n][n];
        for (int li=0; li<n; li++){
            for (int co=0; co<n; co++){
                System.out.println("Digite o valor para a posição (linha: "+li+" - coluna: "+co );
                matriz[li][co]= sc.nextInt();
            }
        }

        System.out.println(matriz);
    sc.close();
    }

}
