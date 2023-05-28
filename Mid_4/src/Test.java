class Book{
    void description(){
        System.out.println("Books are awesome!");
    }
    void putPageMaker(int pageNo){
        System.out.println("Page marker was " + "put on page no: " +pageNo);
    }
}
class PaperBackBook extends Book{
    void description(){
        System.out.println("Paperback books are good for your eyes!");
    }
    void putPageMaker(int pageNo){
        System.out.println("Page marker was " + "put on page no: " +pageNo);
    }
}
public class Test {
    public static void main(String[] args) {
        Book book1,book2;
        book1 = new Book();
        book2 = new PaperBackBook();
        book1.description();
        book2.description();
        book2.putPageMaker(50);

    }
}
