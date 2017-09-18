package softuniBlog.entity;

import javax.persistence.*;

/**
 * Created by DJColdBrain on 10-Aug-17.
 */

@Entity
@Table(name = "article")
public class Article {

    private int id;

    private String title;

    private String content;

    private User author;

    public Article(String title, String content, User author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Article() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(columnDefinition = "text", nullable = false)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @ManyToOne
    @JoinColumn(nullable = false, name = "authorId")
    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Transient
    public String getSummary(){
        if (this.getContent().length() > 50){
            return this.getContent().substring(0, 50 ) + "...";
        }
        return  this.getContent();
    }

}
