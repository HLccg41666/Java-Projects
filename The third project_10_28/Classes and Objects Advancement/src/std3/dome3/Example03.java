package std3.dome3;

class Student{
    String name;
    static String className;
    void read(){
        System.out.println("我的名字是"+name+",来自"+className);
    }
}
public class Example03 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        s1.name="张三";
        s2.name="李四";
        s3.name="王五";
        s1.className="三年级二班";
        s1.read();
        s2.read();
        s3.read();
    }
}
