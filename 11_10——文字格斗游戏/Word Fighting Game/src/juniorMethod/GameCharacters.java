package juniorMethod;

import java.util.Random;

public class GameCharacters {
    private String name;
    private int blood;

    GameCharacters() {
    }

    ;

    GameCharacters(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(GameCharacters obj1) {
        Random rand = new Random();
        int hurt = rand.nextInt(20) + 1;
        int remainBoold = obj1.getBlood() - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        obj1.setBlood(remainBoold);
        System.out.println(this.getName() + "举起拳头，打了" + obj1.getName() + "一下" +
                "造成了" + hurt + "点伤害" + obj1.getName() + "还剩下" + remainBoold + "点血");
    }
}
