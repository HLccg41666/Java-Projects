package std3.dome4;

class Student{
    String name;
    static int age;
    static void staticMethod1(){
        age=20;
        System.out.println("静态方法1中的age为："+age);
        staticMethod2();
    }
    static void staticMethod2(){
        System.out.println("静态方法2中的age为："+age);
    }

    void Method1(){
        name="张三";
        age=22;
        System.out.println("实例方法1中的name为："+name+",age为："+age);
        Method2();
        staticMethod2();
    }
    void Method2(){
        System.out.println("实例方法2中的age为："+age);
    }
}

public class Example04 {
    public static void main(String[] args) {
        Student.staticMethod1();
        Student s1=new Student();
        s1.Method1();
    }
}
