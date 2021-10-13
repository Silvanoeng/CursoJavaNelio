package Aula64.src.aula91;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos alugueis você deseja registrar? ");
        int n = sc.nextInt();
        QuartoAlugado[] vect = new QuartoAlugado[10];

        for (int i=0; i<n; i++){
            if (i>0){
                System.out.println("Dados do quarto seguinte:\n");
            }
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("E-mail: ");
            String email = sc.nextLine();
            System.out.println("Número do quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new QuartoAlugado(nome,email, quarto);
        }
        for (int i=0; i<vect.length; i++) {
            if (vect[i]!=null) {
                System.out.println(vect[i].toString());
            }
        }
    }
}
