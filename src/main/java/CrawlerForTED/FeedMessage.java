package CrawlerForTED;

import javax.persistence.*;

@Entity
@Table
public class FeedMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    String title;
    String description;
    String link;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    @Override
    public String toString() {
        return "CrawlerForTED.FeedMessage [title=" + title + ", description=" + description
                + ", link=" + link + "]";
    }

}