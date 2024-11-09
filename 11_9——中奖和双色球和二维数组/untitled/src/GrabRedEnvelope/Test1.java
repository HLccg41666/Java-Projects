package GrabRedEnvelope;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        //抢红包
        //分别有（2，588，888，1000，10000）五个奖金
        //请用代码模拟抽奖，要求出现顺序随机且不重复
        //思路一：定义一个新数组接受随机索引的索引值，并判断是否新数组已存在该数

        //定义一个数组存储奖项
        int[] arr ={2,588,888,1000,10000};
        //定义一个新数组储存抽出的奖金
        int[] newArr = new int[arr.length];
        //利用Random获取随机索引
        Random rand = new Random();
        for (int i = 0; i < arr.length;) {
            int arrIndex = rand.nextInt(arr.length);
            int prize = arr[arrIndex];
            boolean flag = contains(newArr, prize);
            if (!flag) {
                newArr[i] = prize;
                i++;
            }
        }

        //遍历
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }

    //判断prize再newArr是否存在
    public static boolean contains(int[] arr, int prize) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == prize) {
                return true;
            }
        }
        return false;
    }
}
