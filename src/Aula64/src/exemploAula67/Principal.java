package exemploAula67;

public class Principal {
    public static void main(String[] args) {
        Produto book = new Produto("book", 14.56, 12);

        System.out.println(book.toString());
        book.addQuantity(3);
        System.out.println(book.toString());
        book.removeQuantity(5);
        System.out.println(book.toString());

    }
}
