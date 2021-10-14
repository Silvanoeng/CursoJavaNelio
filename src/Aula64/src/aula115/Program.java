package Aula64.src.aula115;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Order order = new Order(1002, LocalDate.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);
    }
}
