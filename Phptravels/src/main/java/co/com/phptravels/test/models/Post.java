package co.com.phptravels.test.models;

public class Post {

    private String posttitle;
    private String permalink;
    private String body;
    private String keywords;
    private String description;
    private String related;

    public String getPosttitle() {
        return posttitle;
    }

    public String getPermalink() {
        return permalink;
    }

    public String getRelated() {
        return related;
    }

    public String getBody() {
        return body;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getDescription() {
        return description;
    }

    public Post(String posttitle, String permalink, String body, String keywords, String description, String related) {
        this.posttitle = posttitle;
        this.permalink = permalink;
        this.body = body;
        this.keywords = keywords;
        this.description = description;
        this.related = related;
    }
}
