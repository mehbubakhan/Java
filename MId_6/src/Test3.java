class Book {
    String name;
    String author;

    Book(String n, String a) {
        name = n;
        author = a;
        System.out.println("This is a book");
    }
}
class Novel extends Book{
    Novel(String a, String b){
        super(a,b);
        System.out.println(name+" is a novel");
    }
}
class TextBook extends Book{
        String edition;
        TextBook(String a, String b,String edition){
            super(a,b);
            this.edition=edition;
            System.out.println("This is a textbook");
        }
        public void setGenre(String e){
            edition=e;
        }
    }
    public class Test3 {
        public static void main(String[] args){
            Novel N = new Novel("Himu Mama","Humayun Ahmed");
        }
    }
