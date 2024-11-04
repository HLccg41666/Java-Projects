package std3.dome2;

class Student{
    String name;//定义姓名
    int age;//定义年龄

    //定义一个无参的构造方法
    public Student() {
        System.out.println("无参数的构造方法");
    }

    //定义一个接收String类型一个参数的构造方法
    public Student(String name) {
        this();//调用无参构造方法
        System.out.println("一个参数的构造方法");
    }

    //定义一个接收String和interesting类型两个参数的构造方法
    public Student(String name, int age) {
        this(name);//调用一个参构造方法
        System.out.println("两个参数的构造方法" );
    }
}

public class Example02 {
    public static void main(String[] args) {
        //创建一个两个参数的Students对象
        Student s1 = new Student("aaa",18);
    }
}
