public class Mid {
    public static void main(String[] args) {
        ArgentinaFans argentinaFans = new ArgentinaFans(10,"Qatar",2);
        BrazilFans brazilFans = new BrazilFans(7,"Qatar",5);

        System.out.println("Who will be winner?");

        if(argentinaFans.getNoOfGoals()>brazilFans.getNoOfGoals()){
            System.out.println("Argentina will win");
            argentinaFans.incrementWorldCup();
        }
        else{
            System.out.println("Brazil will win");
            brazilFans.incrementWorldCup();
        }

        System.out.println(argentinaFans.toString());
        System.out.println(brazilFans.toString());
    }

}
