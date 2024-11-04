package Test1;

//定义父类person
class person{
    //定义父类两个方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
//定义Student子类
class Student extends person{
    public void study(){
        System.out.println("学生学习");
    }
}
//定义Teacher子类
class Teacher extends person{
    public void teach(){
        System.out.println("老师教课");
    }
}
public class Example01 {
    public static void main(String[] args) {
        //用学生类创建对象
        Student stu = new Student();
        stu.eat();
        stu.sleep();
        stu.study();
        System.out.println("----");
        //用老师类创建对象
        Teacher t = new Teacher();
        t.eat();
        t.sleep();
        t.teach();
    }
}
