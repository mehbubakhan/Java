package americanSuperhero;
class SpiderMan {
    String movieName;
    String directedBy;
    public SpiderMan(String movieName,String directedBy){
        this.movieName=movieName;
        this.directedBy=directedBy;
    }
    public void show(){
        System.out.println(movieName+"\n"+directedBy);
    }
}
public class SuperMan{
    public static void main(String args[]){
        SpiderMan sp = new SpiderMan("The Amazing Spider-Man 2","Marc Webb");
        sp.show();
    }
}