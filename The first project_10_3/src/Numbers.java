import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        System.out.println("输入一个1-99999之间的数: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int sum = number, s = 0, ss = 0;
        while (number != 0) {
            int a = number % 10;
            s=s*10+a;
            number /= 10;
            ss++;
        }
        System.out.println(sum + "是一个" + ss + "位数");
        if (s == sum)
            System.out.println("他是一个回文数");
        else
            System.out.println("他不是一个回文数");
    }
}