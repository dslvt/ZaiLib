package Documents;


public class Book extends Document {

    String publisher;
    String edition;
    int year;

    Book(String title, String authors, int price, String keywords,String publisher, String edition,int year ){
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.keywords = keywords;
        this.publisher = publisher;
        this.edition = edition;
        this.year = year;
    }
}
