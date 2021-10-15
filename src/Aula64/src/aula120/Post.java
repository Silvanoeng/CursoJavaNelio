package Aula64.src.aula120;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Post {
    private LocalDate moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comment;

    public Post(LocalDate moment, String title, String content) {
        this.moment = moment;
        this.title = title;
        this.content = content;
        this.comment = new ArrayList<>();
    }

    public Post() {
        this.comment = new ArrayList<>();
    }

    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComment() {
       return comment;
    }

    public void addComment(Comment comment) {
        this.comment.add(comment);
    }

    public void removeComment(Comment comment) {
        this.comment.remove(comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n");
        sb.append(content + "\n");
        sb.append("Comments: \n");
        for (Comment c : comment) {
            sb.append(c.getText() + "\n");
        }
        return sb.toString();
    }
}
