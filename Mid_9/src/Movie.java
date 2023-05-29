public class Movie {
    private String name;
    protected String origin;
   public String gener;
    public float rating;
    public void setName(String name){
        this.name=name;
    }
    public void setOrigin(String origin){
        this.origin=origin;
    }
    public String getName(){
        return name;
    }
    public String getOrigin(){
        return origin;
    }
    Movie(String name,String origin,String gener,float rating){
        this.name=name;
        this.origin=origin;
        this.gener=gener;
        this.rating=rating;
    }
    Movie(String name,String gener){
        this.name=name;
        this.gener=gener;
    }
    public void Details(){
        System.out.println("You are watching "+name);
        System.out.println("Origin: "+origin);
        System.out.println("Genre: "+gener);
        System.out.println("Rating: "+rating);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("SHUTTER ISLAND","USA","Thriller",8.2f);
        movie.Details();
    }
}
