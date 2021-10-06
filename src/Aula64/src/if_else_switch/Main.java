package if_else_switch;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LocalDate dataNascimento = LocalDate.of(1986,01,25);

        LocalDate dataHoje = LocalDate.now();

        Period periodo = Period.between(dataNascimento, dataHoje);

        if (periodo.getYears()>18){
            System.out.println("Pessoa maior de idade.");
        }
        else {
            System.out.println("Pessoa menor de idade.");
        }
        System.out.println("Fim da execução.");

        String cartao = "Master";

        switch (cartao) {
            case "Master":
                System.out.println("Processa Master...");
                break;
            case "Visa":
                System.out.println("Processa Visa...");
                break;
            case "Amex:":
                System.out.println("Processa Amex...");
                break;
            case "Elo":
                System.out.println("Processa Elo...");
                break;
            default:
                System.out.println("Não sei o cartão.");
        }

        int mes = 2;

        switch (mes) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                System.out.println("Mês com 31 dias.");
                break;
            case 4: case 6:
            case 9: case 11:
                System.out.println("Mês com 30 dias.");
                break;
            case 2:
                System.out.println("Fevereiro pode ter 28 ou 29 dias.");
                break;

        }

    }
}
