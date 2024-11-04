package Test2;

//定义一个类Phone
class Phone{
    public void call(){
        System.out.println("打电话");
    }
}
//定义一个NewPhone类
class NewPhone extends Phone{
    public void call(){
        super.call();
        System.out.println("开启语言");
        System.out.println("关闭语音");
    }
}

public class Example02 {
    public static void main(String[] args) {
        //创建Phone类对象
        Phone phone = new Phone();
        //对象Phone中调用call()方法
        phone.call();
        //创建NewPhone类对象
        NewPhone newphone=new NewPhone();
        //对象newphone中调用call()方法
        newphone.call();
    }
}
