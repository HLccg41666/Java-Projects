//定义people类
class People {
    protected double height;
    protected double weight;

    public void speakHello() {
        System.out.println("Hello,haha");
    }

    public void averageHeight() {
        height = 173;
        System.out.println("average height is+" + height);
    }

    public void averageWeight() {
        weight = 70;
        System.out.println("average weight is" + weight);
    }
}

//定义ChinesePeople类
class ChinesePeople extends People {
    public void chinaGongFu() {
        System.out.println("飞鹤展翅，金鸡独立");
    }

    public void speakHello() {
        System.out.println("你好呀");
    }

    public void averageHeight() {
        height = 168.78;
        System.out.println("中国人的平均身高是：" + height + "厘米");
    }

    public void averageWeight() {
        weight = 65;
        System.out.println("中国人的平均身高是：" + weight + "千克");
    }
}

//定义AmericanPeople类
class AmericanPeople extends People {
    public void americanBoxing() {
        System.out.println("直拳，勾拳，直钩拳");
    }

    public void speakHello() {
        System.out.println("how do you do?");
    }

    public void averageHeight() {
        height = 176;
        System.out.println("American's average height is:" + height + "cm");
    }

    public void averageWeight() {
        weight = 75;
        System.out.println("American's average weight is：" + weight + "kg");
    }
}

//定义BeijingPeople类
class BeijingPeople extends ChinesePeople {
    public void beijingOPera() {
        System.out.println("花脸、青衣、花旦和花生");
    }

    public void speakHello() {
        System.out.println("就这一个地道儿");
    }

    public void averageHeight() {
        height = 172.5;
        System.out.println("北京人的平均身高是：" + height + "厘米");
    }

    public void averageWeight() {
        weight = 70;
        System.out.println("北京人的平均体重是：" + weight + "千克");
    }
}

public class Example01 {
    public static void main(String[] args) {
        //分别实例化三个类
        ChinesePeople china = new ChinesePeople();
        AmericanPeople american = new AmericanPeople();
        BeijingPeople beijing = new BeijingPeople();
        //调用speakHello方法
        china.speakHello();
        american.speakHello();
        beijing.speakHello();
        //调用averageHeight方法
        china.averageHeight();
        american.averageHeight();
        beijing.averageHeight();
        //调用averageWeight方法
        china.averageWeight();
        american.averageWeight();
        beijing.averageWeight();
        //调用chinaGongFu方法
        china.chinaGongFu();
        american.americanBoxing();
        beijing.beijingOPera();
    }
}