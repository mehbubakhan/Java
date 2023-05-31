import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Player implements Comparable<Player>{
    int jersey;
    String name,type;
    public Player(int jersey,String name,String type){
        this.jersey=jersey;
        this.name=name;
        this.type=type;
    }

    public int compareTo(Player player){
        if(this.jersey>player.jersey){
            return 1;
        }
        else if(this.jersey<player.jersey){
            return -1;
        }
        else {
            return 0;
        }
    }
}
public class comparator_main_5 {
    public static void main(String[] args) {
        ArrayList<Player> list = new ArrayList<>();
        list.add(new Player(55,"Karim","Bangladesh"));
        list.add(new Player(14,"Ponting","Australia"));
        Collections.sort(list);
        for(Player p : list){
            System.out.println(p.name+" "+p.jersey+" "+p.type);
        }
    }
}
