public class Holiday {
    private String name;
    private int day;
    private String month;
    Holiday(String name , int day , String month){
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public void setName(String name , int day , String month){
        this.name=name;
        this.day=day;
        this.month=month;
    }
    public boolean isSameMonth(String month){
        if(month.toLowerCase()==this.month.toLowerCase()){
            return true;
        }
        else {
            return false;
        }
    }
    public double avgDate(int []arr){
        double avg;
        
    }
}
