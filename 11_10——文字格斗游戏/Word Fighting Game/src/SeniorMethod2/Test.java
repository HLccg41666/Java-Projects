package SeniorMethod2;


public class Test {
    public static void main(String[] args) {
        SeniorGameCharacters senior1 = new SeniorGameCharacters("小三",100,'男');
        SeniorGameCharacters senior2 = new SeniorGameCharacters("正主",100,'女');
       // senior1.showGameCharacters();
      //  senior2.showGameCharacters();

        //调用attack方法进行攻击
        while (true) {
            senior1.attack(senior2);
            System.out.println();
            if (senior2.getBlood() == 0) {
                System.out.println(senior1.getName() + "打败了" + senior2.getName());
                break;
            }
            senior2.attack(senior1);
            System.out.println();
            if (senior1.getBlood() == 0) {
                System.out.println(senior2.getName() + "打败了" + senior1.getName());
                break;
            }
        }

    }
}
