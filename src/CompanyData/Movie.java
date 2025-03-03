package CompanyData;

public class Movie {

    private String title;
    private String kind;
    private String genre;
    private String duration;
    private String language;

    public Movie(String title, String kind, String genre, String duration, String language) {
        this.title = title;
        this.kind = kind;
        this.genre = genre;
        this.duration = duration;
        this.language = language;
    }

    public String getTitle() {
        return this.title;
    }

    public String getKind() {
        return this.kind;
    }

    protected String getGenre() {
        return this.genre;
    }

    protected String getDuration() {
        return this.duration;
    }

    public String getLanguage() {
        return this.language;
    }
}
