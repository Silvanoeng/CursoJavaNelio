package Aula64.src.aula91;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FuncaoLambda {
    public static void main(String[] args) {

        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Maria");
        listaNomes.add("João");
        listaNomes.add("Julio");
        listaNomes.add(1, "Paulo");
        listaNomes.add("Silvano");

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        System.out.println("--------------------------------------------");
        System.out.println("---Removendo nomes com J---");
        listaNomes.removeIf(x -> x.charAt(0) == 'J');

        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        System.out.println("--------------------------------------------");
        listaNomes.add("Marta");
        listaNomes.add("Priscila");
        listaNomes.add("Isadora");

        System.out.println("Index of Isadora: " + listaNomes.indexOf("Isadora"));
        System.out.println("--------------------------------------------");

        List<String> result = listaNomes.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for (String nome : result) {
            System.out.println(nome);
        }
        System.out.println("--------------------------------------------");

        String nomeEscolhido = listaNomes.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
        System.out.println(nomeEscolhido);


    }
}
