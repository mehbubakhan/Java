public class Calculator {
    public int a;
    public int b;
    Calculator(int firstname,int secondNumber){
        this.a=firstname;
        this.b=secondNumber;
    }
    public int sum(){
        return a+b;
    }
    public int subtract(){
        return a-b;
    }
}

