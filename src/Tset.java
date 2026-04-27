public class Tset {
    public static void main(String[] args) {
        A obj = new A();
        obj.fun1();
    }
}


class A{
    static int a = 15;
    void fun1(){
        System.out.println(a);
    }
}
