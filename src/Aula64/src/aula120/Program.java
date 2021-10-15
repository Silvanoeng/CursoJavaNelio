package Aula64.src.aula120;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Post post01 = new Post(LocalDate.of(2018,06,21),"Traveling to New Zealand","I'm going to visit this wonderful country!");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        post01.setLikes(12);
        post01.addComment(c1);
        post01.addComment(c2);

        System.out.println(post01);

        Post post02 = new Post(LocalDate.of(2018,07,28),"Good night guys","See you tomorrow");
        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        post02.setLikes(5);
        post02.addComment(c3);
        post02.addComment(c4);

        System.out.println(post02);

    }
}
