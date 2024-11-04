package Test3;

class Father{
    public Father(){
        System.out.println("Father无参调用方法！");
    }
    public Father(String name){
        System.out.println("Father类一个有参调用方法！");
    }
}
class Son extends Father{
    public Son(){
        super();
        System.out.println("Son类无参调用方法！");
    }
    public Son(String name){
        super(name);
        System.out.println("Son类一个有参调用方法！");
    }
}

public class Example03 {
    public static void main(String[] args) {
        Son s1 = new Son();
        Son s2 = new Son("Son");
    }
}
