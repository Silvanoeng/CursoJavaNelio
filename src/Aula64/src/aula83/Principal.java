package Aula64.src.aula83;

public class Principal {
    public static void main(String[] args) {
        Conta conta01 = new Conta("Silvano", 1200.0);
        Conta conta02 = new Conta("Maria", 200.0);
        Conta conta03 = new Conta("João", 1600.0);
        Conta conta04 = new Conta("Tereza", 1200.0);


        conta01.saque(800.00);
        System.out.println("Saldo: " + conta01.getSaldo());

        conta02.saque(200.00);
        System.out.println("Saldo: " + conta02.getSaldo());

        System.out.println(conta01.toString());
        System.out.println(conta02.toString());
        System.out.println(conta03.toString());
        System.out.println(conta04.toString());

    }
}
