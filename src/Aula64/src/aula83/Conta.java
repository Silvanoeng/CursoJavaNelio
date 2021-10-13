package Aula64.src.aula83;

public class Conta {
    private int numeroConta;
    private String nome;
    private boolean estado;
    private double saldo;
    private static int numeroDeContas = 0;

    public Conta(String nome, double saldo) {
        Conta.numeroDeContas++;
        this.numeroConta = Conta.numeroDeContas;
        this.nome = nome;
        this.estado = true;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getSaldo() {
        return saldo;
    }

    public static int getNumeroDeContas() {
        return numeroDeContas;
    }

    public void setNome(String nome) {
        if (nome.equals("") || nome.equals(null)) {
            System.out.println("Esse valor não é valido.");
            return;
        }
        this.nome = nome;
    }

    public void setEstado(boolean estado) {
        if (estado != true || estado != false) {
            System.out.println("Esse valor não é valido.");
            return;
        }
        this.estado = estado;
    }

    public void saque(double valor) {
        if (this.saldo>(valor + 5.00)) {
            this.saldo-= (valor + 5.00);
        }
        else {
            System.out.println("Saldo insuficiente, na conta " + this.numeroConta);
        }
    }

    public void depositar(double valor) {
        if (valor<0.01) {
            System.out.println("Valor não é valido.");
            return;
        }
        this.saldo += valor;
    }

    @Override
    public String toString() {
        return String.format("Número da conta: %03d", numeroConta) +
                ", nome: " + nome +
                ", saldo: " + saldo;
    }
}
