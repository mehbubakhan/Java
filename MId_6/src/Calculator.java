public class Calculator {
    public int add(int num1,int num2){
        int Add;
        Add=num1+num2;
        return Add;
    }
    public double add(int num1,double num2){
        double Add;
        Add=num1+num2;
        return Add;
    }
    public double add(int num1,double num2,double num3){
        double Add;
        Add=num1+num2+num3;
        return Add;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5,7);
        calculator.add(6,8.9);
        calculator.add(6,8.9,1.1);
    }

}
