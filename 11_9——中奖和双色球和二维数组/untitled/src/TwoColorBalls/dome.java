package TwoColorBalls;

import java.util.Random;
import java.util.Scanner;

public class dome {
    public static void main(String[] args) {
        //双色球系统：
        //投注号码由6个红色球号码和1个蓝色球号码组成。
        //红色球号码：1-33  不能重复
        //蓝色球号码：1-16

        //定义一个数组储存中奖号码
        int[] WinningArr = new int[7];
        //定义一个数组储存投注号码
        int[] BettingArr = new int[7];
        //获得中奖号码
        getWinningBall(WinningArr);
        //打印中奖号码
        System.out.println("Winning ball: ");
        printArray(WinningArr);
        //获得投注号码
        System.out.println("Betting ball: ");
        getBettingBall(BettingArr);
        //计算中奖金额
        int HongBall = getHongBonus(WinningArr, BettingArr);
        boolean LanBall = getLanBall(WinningArr, BettingArr);
        if (LanBall) {
            switch (HongBall) {
                case 0:
                case 1:
                case 2: {
                    System.out.println("中奖金额为：5元");
                    break;
                }
                case 3: {
                    System.out.println("中奖金额为：10元");
                    break;
                }
                case 4: {
                    System.out.println("中奖金额为：200元");
                    break;
                }
                case 5: {
                    System.out.println("中奖金额为：3000元");
                    break;
                }
                case 6: {
                    System.out.println("中奖金额为：1000万");
                    break;
                }
            }
        } else {
            switch (HongBall) {
                case 4: {
                    System.out.println("中奖金额为：10元");
                    break;
                }
                case 5: {
                    System.out.println("中奖金额为：200元");
                    break;
                }
                case 6: {
                    System.out.println("中奖金额为：500万");
                    break;
                }
                default: {
                    System.out.println("谢谢参与");
                    break;
                }
            }
        }
    }

    //获得中奖号码
    public static void getWinningBall(int[] WinnerArr) {
        Random rand = new Random();
        //红色球号码(1-33)
        for (int i = 0; i < WinnerArr.length; ) {
            int Number = rand.nextInt(33) + 1;
            boolean flag = containsBall(WinnerArr, Number);
            if (!flag) {
                WinnerArr[i] = Number;
                i++;
            }
        }
        //蓝色球号码(1-16)
        WinnerArr[WinnerArr.length - 1] = rand.nextInt(16) + 1;
    }

    //键盘输入投注号码
    public static void getBettingBall(int[] BettingArr) {
        Scanner sc = new Scanner(System.in);
        //红色球号码(1-33)
        for (int i = 0; i < BettingArr.length - 1; ) {
            int Number = sc.nextInt();
            boolean flag = containsBall(BettingArr, Number);
            if (!flag) {
                BettingArr[i] = Number;
                i++;
            }
        }
        //蓝色球号码(1-16)
        BettingArr[BettingArr.length - 1] = sc.nextInt();
    }

    //判断号码是否重复
    public static boolean containsBall(int[] arr, int Number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Number) {
                return true;
            }
        }
        return false;
    }

    //计算中奖球数
    //红色球
    public static int getHongBonus(int[] WinnerBall, int[] BettingBall) {
        int HongNumber = 0;
        for (int i = 0; i < WinnerBall.length - 1; i++) {
            for (int j = 0; j < BettingBall.length - 1; j++) {
                if (WinnerBall[i] == BettingBall[j]) {
                    HongNumber++;
                    break;
                }
            }
        }
        return HongNumber;
    }

    //蓝色球
    public static boolean getLanBall(int[] WinnerBall, int[] BettingBall) {
        boolean flag = false;
        if (WinnerBall[WinnerBall.length - 1] == BettingBall[BettingBall.length - 1]) {
            flag = true;
        }
        return flag;
    }

    //遍历
    public static void printArray(int[] arr) {
        System.out.print("红球：");
        for (int i = 0; i < arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("篮球：");
        System.out.println(arr[arr.length - 1]);
        System.out.println();
    }
}
