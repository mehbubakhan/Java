 class Area {
    private int length;
    private int width;
    Area(int length , int width){
        this.length=length;
        this.width=width;
    }
    public void setLength(int length){
        this.length=length;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getLength(){
        return length;
    }
    public int getWidth(){
    return width;
    }
    public int returnArea(int length,int width){
        int A;
        A=width*length;
        return A;
    }
    {
        System.out.println("The area A of a rectangle is given by the formula, A=lw, where l is the length and w is the width.");
    }

    public static void main(String[] args) {
        Area area = new Area(5,6);
    }
}
