package GrabRedEnvelope;

import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        //抢红包
        //分别有（2，588，888，1000，10000）五个奖金
        //请用代码模拟抽奖，要求出现顺序随机且不重复
        //思路二：直接打乱奖项数组里的数据

        int[] arr = {2, 588, 888, 1000, 10000};
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            //获取随机索引
            int randIndex = rand.nextInt(arr.length);
            //将索引i上的元素与randIndex上的进行交换
            int temp = arr[i];
            arr[i] = arr[randIndex];
            arr[randIndex] = temp;
        }

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
