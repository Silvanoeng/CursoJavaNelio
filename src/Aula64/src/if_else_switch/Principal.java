package if_else_switch;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Integer nuns, n1, n2, n3, n4;
        ArrayList<Integer> numeroEscolhido = new ArrayList();

        for (Integer i=1000; i<10000; i++) {

            nuns = i;
            n1 = nuns / 1000;
            n2 = (nuns % 1000) / 100;
            n3 = (nuns % 100) / 10;
            n4 = nuns % 10;
            Integer somaDeN = n1 + n2 + n3 + n4;
            if (n1 < 7 && n2 < 7 && n3 < 7 && n4 < 7 && somaDeN==21){
                numeroEscolhido.add(nuns);
            }
            else {

            }
        }
        for (Integer num : numeroEscolhido) {

            System.out.println(num);

        }
    }
}
