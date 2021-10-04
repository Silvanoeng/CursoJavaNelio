package curso.nelio;

public class Principal {

    public static void main(String[] args) {


        Triangle triX = new Triangle(3.0, 4.0, 5.0);

        Triangle triY = new Triangle(7.5, 4.5, 4.02);


        System.out.println(triX.areaDoTriangle());


        System.out.println(triY.areaDoTriangle());

        triX.compararTriangle(triY);

    }
}
