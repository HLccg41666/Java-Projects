package Test4;

abstract class Animal{
    public void sleep(){}//定义一个sleep方法，方法体为空
}
class Cat extends Animal{
    public void catchMouse(){
        System.out.println("抓老鼠");
        }
    public void sleep(){
        System.out.println("睡觉");
    }
}

public class Example04 {
    public static void main(String[] args) {
        //将Cat类创建队形的引用放到Animal类声明的animal对象中
        Cat cat = new Cat();
        Animal animal = cat;
        animal.sleep();//调用sleep方法
        //animal.catchMouse();---调用catchMouse不能调用成功
    }
}
