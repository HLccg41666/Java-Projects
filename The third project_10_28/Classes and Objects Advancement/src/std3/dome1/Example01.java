package std3.dome1;

class Student{
    String name;//定义姓名
    int age;//定义年龄

    //定义一个无参的构造方法
    public Student() {
        System.out.println("无参数的构造方法");
    }

    //定义一个接收String类型一个参数的构造方法
    public Student(String name) {
        this.name = name;
        System.out.println("一个参数的构造方法" + "姓名为：" + name);
    }

    //定义一个接收String和interesting类型两个参数的构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("两个参数的构造方法" + "姓名为：" + name +", 年龄为：" + age);
    }
}

public class Example01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student("Tom");
        Student stu3 = new Student("Bob",20);
    }
}
