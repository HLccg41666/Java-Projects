package project02;

//定义Phone接口
interface Phone {
    public void receiveMessages();

    public void call();
}
//定义实现类
interface SmartPhone extends Phone {
    public void faceTime();
}
//定义实现类
public class MIPhone implements SmartPhone {
    public void receiveMessages() {
        System.out.println("接收短信");
    }

    public void call() {
        System.out.println("语音通话");
    }

    public void faceTime() {
        System.out.println("视频通话");
    }

    public void useMIUI() {
        System.out.println("使用MIUI");
    }
}
