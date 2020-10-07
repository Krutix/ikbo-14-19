package lw2.ex3;

class BookTest {
    public static void main(String[] argv) {
        Book testBook = new Book("The art of computer programming", "Donald E. Knuth", 1963, 1969);
        System.out.println(testBook);
        testBook.setPublishYear(2001);
        System.out.println(testBook);
    }
}