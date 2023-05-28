class Book{
    public int chapters;
    public int pages;
    public Book(int chapters , int pages){
        this.chapters=chapters;
        this.pages=pages;
    }
    public void printSummary(){
        System.out.println("Chapters : " + chapters);
        System.out.println("Pages : " + pages);
    }
}
class EBook extends Book{
    public String format;
    EBook(){
       super(2,5);
    }
    EBook(int chapter , int pages, String format){
        super(chapter,pages);
        this.format=format;
    }
    public void printSummary(){
        System.out.println("Chapters : " + chapters);
        System.out.println("Pages : " + pages);
        System.out.println("Format :" + format);
    }
}
public class InheritanceTest {
    public static void main(String[] args) {
        EBook java = new EBook();
        int chapters=8;
        int pages =500;
        EBook c = new EBook(chapters,pages,"pdf");
        Book b = java;
        b.printSummary();
        b=c;
        b.printSummary();


    }
}
