public class Main {
    public static void main(String[] args){
        int i,j,num,mid;
        num=9;
        mid=(num/2)+1;
        for(i=1;i<=mid;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            for(j=1;j<=(mid-i-1);j++)
            {
                System.out.print(" ");
            }
            for(j=1;j<=mid;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}