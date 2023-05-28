package americanSuperhero;
class SpiderMan {
    String movieName;
    String directedBy;
    SpiderMan(String movieName,String directedBy){
        this.movieName=movieName;
        this.directedBy=directedBy;
    }
    void show(){
        System.out.println(movieName);
        System.out.println(directedBy);
    }

}
public class SuperMan {
    public static void main(String[] args) {
        SpiderMan spider = new SpiderMan("The Amazing Spider-Man 2","Marc Webb");
        spider.show();
    }
}
