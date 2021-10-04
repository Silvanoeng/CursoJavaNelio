package poo.intellij;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s1, s2, s3;
//        s1 = sc.nextLine();
//        s2 = sc.nextLine();
//        s3 = sc.nextLine();
//        System.out.println("DADOS DIGITADOS:");
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
//        sc.close();
        Scanner sc = new Scanner(System.in);

        int n, acum;
        n = sc.nextInt();
        if (n > 1) {
            acum = n;
            for (int i = n; i > 1; i--) {
                acum = ((i - 1) * acum);

            }
            System.out.print(acum);
        } else {
            System.out.print(n);
        }
    }
}

