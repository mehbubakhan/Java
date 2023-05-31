public class Rectangle {
    public double length;
    public double width;
    public double perimeter;
    public double area;

    Rectangle(double length , double width){
        this.length = length;
        this.width = width;
    }
    public double caculateArea(){
        area = length*width;
        return area;
    }
    public double calculatePerimeter(){
        perimeter = 2*(length + width);
        return perimeter;
    }
}
