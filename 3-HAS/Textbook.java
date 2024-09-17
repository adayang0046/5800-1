

public class Textbook {
    private String title,author,publisher;
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public Textbook(String title, String author, String publisher){
        setTitle(title);
        setAuthor(author);
        setPublisher(publisher);
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getPublisher(){
        return publisher;
    }

    public void print(){
        System.out.println("Textbook: " + title + " | Author: " + author + " Publisher: " + publisher);
    }


}
