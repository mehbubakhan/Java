abstract class abs {
    abstract public void m1();

    public void m2() {

    }
}
interface I1 {
    public void m3();
    public void m4 ();
}
interface I2 {
    public void m5();
    public void m6();
}
abstract class Abstraction extends abs implements I1,I2 {
    @Override
    public void m1() {};
    public void m3() {};
    public void m4() {};
    public void m5() {};
}
