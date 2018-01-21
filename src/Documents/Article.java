package Documents;


public class Article extends Document {

    String journal;
    String publisher;
    String issue;
    String editor;
    String date;

    Article(String title, String authors, int price, String keywords, String publisher, String journal, String issue, String editor, String date){
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.keywords = keywords;
        this.publisher = publisher;
        this.journal = journal;
        this.issue = issue;
        this.editor = editor;
        this.date = date;
    }
}
