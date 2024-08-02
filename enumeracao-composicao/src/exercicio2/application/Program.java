package exercicio2.application;

import exercicio2.entities.Comment;
import exercicio2.entities.Post;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip!");
        Comment comment2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(
                LocalDateTime.parse("21/06/2018 13:05:44", format),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12
        );

        post1.addComment(comment1);
        post1.addComment(comment2);

        Comment comment12 = new Comment("Good night");
        Comment comment22 = new Comment("May the Force be with you");

        Post post2 = new Post(
                LocalDateTime.parse("28/07/2018 23:14:19", format),
                "Good night guys",
                "See you tomorrow",
                5
        );

        post2.addComment(comment12);
        post2.addComment(comment22);

        System.out.println(post1);
        System.out.println(post2);
    }
}
