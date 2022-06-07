public class Book {

    private String author;
    private String title;

    public static Book of (String author, String title){
        return  new Book (author,title);

    }
    public Book (String author,String title){
        this.author = author;
        this.title = title;

    }
    public static void main(String[] args) {
        Book book = Book.of ("Issac Asimov","The Galaxy");
        System.out.println(book.author +  "  "  + book.title);
    }
}
