import java.util.Scanner;
import java.util.Random;
public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("给你一个1至100之间的整数，请猜出这个数字：");
        //获取随机数
        Random random = new Random();
        int number = random.nextInt(100) + 1;//随机数的范围：（可自行修改）
        //用while循环加if判断来实现对数字的猜测
        while (true) {
            //键盘输入要猜测的数字
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            //判断猜到的数字与生成随机数是否相等
            if (number < num) {
                System.out.println("猜大了，请继续猜");
            } else if (number > num) {
                System.out.println("猜小了，请继续猜");
            } else {
                System.out.println("恭喜你，猜对了~~");
                break;//猜对后，结束猜测
            }
        }
    }
}
