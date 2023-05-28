class PClass{
    void mFnc(){
        System.out.println("Hello from P Class !");
    }
    void mFnc(double d1){
        System.out.println("Double Value : "+d1);
    }
}
class CClass extends PClass{
    void mFnc(){
        System.out.println("Hello from C Class !");
        super.mFnc(11.22);
    }
    void mFnc(int a2,double d2){
        mFnc(d2);
        System.out.println("Integer Value : "+a2);
    }
}
public class Main {
    public static void main(String[] args) {
        PClass pobj = new PClass();
        CClass cobj = new CClass();
        pobj.mFnc();
        cobj.mFnc();
        cobj.mFnc(10,2.99);
        cobj.mFnc(3.145);
    }
}