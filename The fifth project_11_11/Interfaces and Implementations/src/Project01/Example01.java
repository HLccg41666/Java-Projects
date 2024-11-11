package Project01;
//定义Inter接口
interface Inter {
    public int num = 20;
    public void method();
}
//定义一个实现类I你term1
class InterImp1 implements Inter {
    public void show() {
        System.out.println(num);
    }
    public void method() {
        System.out.println("InterImpl method");
    }
}

public class Example01 {
    public static void main(String[] args) {
        InterImp1 interimp1 = new InterImp1();
        interimp1.show();
        interimp1.method();
    }
}
