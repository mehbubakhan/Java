package M1;

public class Human {
    {
        System.out.println("To avoid getting scared or eaten be brave or intelligent");
    }
    private int id;
    String intelligence;
    protected boolean bravery;
    public Human(int id,String intelligence,boolean bravery){
        this.id=id;
        this.intelligence=intelligence;
        this.bravery=bravery;
    }
    public boolean getBravery(){
        return bravery;
    }
    public int getId(){
        return id;
    }
}

