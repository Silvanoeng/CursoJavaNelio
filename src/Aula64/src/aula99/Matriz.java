package Aula64.src.aula99;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tamanho da matriz: ");
        int n = sc.nextInt();
        int [][] matriz = new int[n][n];
        for (int li=0; li<matriz.length; li++){
            for (int co=0; co<matriz[li].length; co++){
                System.out.println("Digite o valor para a posição (linha: "+li+" - coluna: "+co );
                matriz[li][co]= sc.nextInt();
            }
        }
        System.out.println("-----------------------------------------------------");

        for (int i=0;i<matriz.length;i++){
            System.out.print(matriz[i][i]+" ");
        }

        System.out.println("\n-----------------------------------------------------");
        int cont=0;
        for (int li=0; li<matriz.length; li++){
            for (int co=0; co<matriz[li].length; co++){
                if(matriz[li][co]<0) {
                 cont++;
                }
            }
        }
        System.out.println(cont +" é a quantidade de números negativos na matriz.");
        System.out.println("-----------------------------------------------------");
        for (int li=0; li<matriz.length; li++){
            for (int co=0; co<matriz[li].length; co++){
                System.out.print(matriz[li][co]+" ");
            }
            System.out.println("\n");
        }
        sc.close();
    }

}
