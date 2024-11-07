package JudgesScore;

import java.util.Scanner;

public class demo1 {
    public static void main(String[] args) {
        //评委打分，分数范围【1-100】的整数，选手最后得分为去掉最高分和最低分的四位评委的平均分

        //定义一个数组接受键盘输入
        int[] scoreArr = getArr();
        //计算最大值
        int maxScore = getMax(scoreArr);
        //计算最小值
        int minScore = getMin(scoreArr);
        //计算选手的得分
        printArr(scoreArr, maxScore, minScore);
    }

    //获得评委分数
    public static int[] getArr() {
        int[] arr = new int[6];
        int temp = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入选手分数");
            temp = sc.nextInt();
            if (0 <= temp && temp <= 100) {
                arr[i] = temp;
                i++;
            } else {
                System.out.println("输入分数不合法，请重新输入");
            }
        }
        return arr;
    }

    //计算最大值
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //计算最小值
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //计算选手得分
    public static void printArr(int[] arr, int max, int min) {
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number += arr[i];
        }
        System.out.println("选手的分数为：" + (number - max - min) / 4);
    }
}
