package L3;

public class BookDemo {

    public static void main(String args[]) {
        Book books[] = new Book[5];

        books[0] = new Book("Java: A Beginner's Guide",
                "Schildt", 2018, 101);
        books[1] = new Book("Java: The Complete Reference",
                "Schildt", 2018, 99);
        books[2] = new Book("Introducing JavaFX 8 Programming",
                "Schildt", 2015, 100);
        books[3] = new Book("Red Storm Rising",
                "Clancy", 1986, 200);
        books[4] = new Book("On the Road",
                "Kerouac", 1955, 199);

//        for(int i=0; i < books.length; i++) books[i].show();

//        Listing books where the pages are more than 100
        for(int i = 0; i < books.length; i++) {
            if(books[i].getPages() > 100) {
                books[i].show();
            }
        }
    }

}
