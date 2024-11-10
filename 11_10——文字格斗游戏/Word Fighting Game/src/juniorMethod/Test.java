package juniorMethod;

public class Test {
    public static void main(String[] args) {
        GameCharacters s1 = new GameCharacters("小三", 100);
        GameCharacters s2 = new GameCharacters("正主", 100);

        while (true) {
            s1.attack(s2);
            if (s2.getBlood() == 0) {
                System.out.println(s1.getName() + "打败了" + s2.getName());
                break;
            }
            s2.attack(s1);
            if (s1.getBlood() == 0) {
                System.out.println(s2.getName() + "打败了" + s1.getName());
                break;
            }
        }
    }
}
