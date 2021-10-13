package Aula64.src.aula99;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatrizExercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas linhas a matriz deve ter: ");
        int linhas = sc.nextInt();
        System.out.println("Quantas colunas a matriz deve ter: ");
        int colunas = sc.nextInt();
        int [][] matriz = new int[linhas][colunas];
        for (int li=0; li<matriz.length; li++){
            for (int co=0; co<matriz[li].length; co++){
                System.out.println("Digite o valor para a posição (linha: "+li+" - coluna: "+co );
                matriz[li][co]= sc.nextInt();
            }
        }
        System.out.println("-----------------------------------------------------");
        for (int li=0; li<matriz.length; li++){
            for (int co=0; co<matriz[li].length; co++){
                System.out.print(matriz[li][co]+" ");
            }
            System.out.println("\n");
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("Escolha um número da matriz: ");
        int numeroEscolhido = sc.nextInt();

        System.out.println("\n-----------------------------------------------------");



        for (int li=0; li<matriz.length; li++){
            for (int co=0; co<matriz[li].length; co++){

                if(numeroEscolhido==matriz[li][co]) {
                    if(co>0) {
                        Integer numEsq = matriz[li][co - 1];
                        System.out.println("A esquerda: " + numEsq);
                    }
                    if(li>0) {
                        Integer numCim = matriz[li - 1][co];
                        System.out.println("A cima: " + numCim);
                    }
                    if((co+1)<matriz[li].length) {
                        Integer numDir = matriz[li][co + 1];
                        System.out.println("A direita: " + numDir);
                    }
                    if((li+1)<matriz.length) {
                        Integer numAba = matriz[li + 1][co];
                        System.out.println("Abaixo: " + numAba);
                    }
                    System.out.println("\n-----------------------------------------------------");
                }
            }
        }

        sc.close();
    }

}
