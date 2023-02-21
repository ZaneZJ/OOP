package L3;

public class Book {

    private String title;
    private String author;
    private int pubDate;
    private int pages;

    Book(String t, String a, int d, int p) {
        title = t;
        author = a;
        pubDate = d;
        pages = p;
    }

    public int getPages() {
        return pages;
    }

    void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println(pages);
        System.out.println();
    }

}
