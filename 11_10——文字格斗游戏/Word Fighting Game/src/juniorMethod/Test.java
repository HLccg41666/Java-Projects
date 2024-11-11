package juniorMethod;

public class Test {
    public static void main(String[] args) {
            JuniorGameCharacters s1 = new JuniorGameCharacters("小三", 100);
            JuniorGameCharacters s2 = new     JuniorGameCharacters("正主", 100);

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
