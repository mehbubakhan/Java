class AQ{
    double v1;
    int a1;
    public AQ(double v1,int a1){
        this.v1=v1;
        this.a1=a1;
    }
    public AQ(){
        this(100,19);
    }
    void f1( int a,int b){
        System.out.println(a+b+a1+v1);
    }
    void f2( int x,int y){
        System.out.println(x+y+a1+v1);
    }
}