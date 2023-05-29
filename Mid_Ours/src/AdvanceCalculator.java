public class AdvanceCalculator extends Calculator{
    int arr[];
    AdvanceCalculator(int a,int b,int arr[]){
        super(a,b);
        this.arr=arr;
    }
    public int sum(){
        int Sum=a+b;
        for(int i=0;i<arr.length;i++){
            Sum+=arr[i];
        }
        return Sum;
    }
//    public int subtract(){
//        int Sub=a-b;
//        for(int i=0;i<arr.length;i++){
//            Sub-=arr[i];
//        }
//        return Sub;
//    }
}
