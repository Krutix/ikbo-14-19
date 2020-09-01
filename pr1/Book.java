public class Book {
    private String name = "None";
    private String author = "None";
    private int numberOfPages = 0;

    Book(){}

    Book(String newName){
        name = newName;
    }

    Book(String newName, String newAuthor){
        name = newName;
        author = newAuthor;
    }

    Book(String newName, String newAuthor, int newNumberOfPages){
        name = newName;
        author = newAuthor;
        numberOfPages = newNumberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }
}
