package SeniorMethod2;

import juniorMethod.JuniorGameCharacters;

import java.util.Random;

public class SeniorGameCharacters {
    private String Name;//名字
    private int blood;//血量
    private char gender;//性别
    private String face;//长相

    String boyFace[] = {"玉树临风", "英俊潇洒", "风流倜傥", "貌似潘安", "形貌昳丽", "器宇轩昂", "风度翩翩", "气宇不凡", "貌似端庄"};
    String girlFace[] = {"亭亭玉立", "倾国倾城", "国色天香", "沉鱼落雁", "闭月羞花", "冰清玉洁", "天生丽质", "小家碧玉", "我见犹怜"};

    //攻击描述
    String[] attacks_desc = {
            "%s使出了一招【背心钉】,转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】,飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红,一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //受伤描述
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    //空参构造
    public SeniorGameCharacters() {
    }

    //包含全部变量的构造
    public SeniorGameCharacters(String name, int blood, char gender) {
        this.Name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char newGender) {
        //长相是随机的
        Random rand = new Random();
        if (getGender() == '男') {
            int index = rand.nextInt(boyFace.length);
            this.face = boyFace[index];
        }
        if (getGender() == '女') {
            int index = rand.nextInt(girlFace.length);
            this.face = girlFace[index];
        }
    }

    public void showGameCharacters() {
        System.out.println("姓名为: " + getName());
        System.out.println("血量为: " + getBlood());
        System.out.println("性别为: " + getGender());
        System.out.println("长相为: " + getFace());
    }

    public void attack(SeniorGameCharacters obj1) {
        Random rand = new Random();
        int index = rand.nextInt(attacks_desc.length);
        String KunFu = attacks_desc[index];
        System.out.printf(KunFu, this.getName(), obj1.getName());

        int hurt = rand.nextInt(20) + 1;

        int remainBoold = obj1.getBlood() - hurt;
        remainBoold = remainBoold < 0 ? 0 : remainBoold;
        obj1.setBlood(remainBoold);

        //受伤描述
        if (remainBoold > 90) {
            System.out.printf(injureds_desc[0], obj1.getName());
        } else if (remainBoold > 80 && remainBoold < 90) {
            System.out.printf(injureds_desc[1], obj1.getName());
        } else if (remainBoold > 70 && remainBoold < 80) {
            System.out.printf(injureds_desc[2], obj1.getName());
        } else if (remainBoold > 60 && remainBoold < 70) {
            System.out.printf(injureds_desc[3], obj1.getName());
        } else if (remainBoold > 40 && remainBoold < 60) {
            System.out.printf(injureds_desc[4], obj1.getName());
        } else if (remainBoold > 20 && remainBoold < 40) {
            System.out.printf(injureds_desc[5], obj1.getName());
        } else if (remainBoold > 10 && remainBoold < 20) {
            System.out.printf(injureds_desc[6], obj1.getName());
        }else{
            System.out.printf(injureds_desc[7], obj1.getName());
        }
    }


}
