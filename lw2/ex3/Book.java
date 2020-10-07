package lw2.ex3;

public class Book {
    private String title;
    private String author;
    private int createYear;
    private int publishYear;

    public Book(String title, String author, int createYear, int publishYear) {
        this.title = title;
        this.author = author;
        this.createYear = createYear;
        this.publishYear = publishYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCreateYear() {
        return createYear;
    }

    public void setCreateYear(int createYear) {
        this.createYear = createYear;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", createYear=" + createYear +
                ", publishYear=" + publishYear +
                '}';
    }
}
