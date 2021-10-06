package if_else_switch;

import java.time.LocalDate;
import java.time.Period;

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

        int s, n1, n2, n3, n4;
        s = 5000;
        n1 = s/1000;
        n2 = (s%1000)/100;
        n3 = (s%100)/10;
        n4 = s%10;
        System.out.println(s + " * " + n1 + " * " + n2 + " * " + n3 + " * " + n4);
    }
}
