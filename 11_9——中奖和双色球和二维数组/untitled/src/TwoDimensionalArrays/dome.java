package TwoDimensionalArrays;

public class dome {
    public static void main(String[] args) {
        /*
        某商城每个季度的营业额如下：单位（万元）
        第一个季度：22，66，44
        第二个季度：77，33，88
        第三个季度：25，45，65
        第四个季度：11，66，99
         */

        //定义一个二维数组
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {25, 45, 65},
                {11, 66, 99}
        };

        int yearSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = mouthSum(arr[i]);
            System.out.println("第" + (i + 1) + "季度:" + sum + "万元");
            yearSum = yearSum + sum;
        }
        System.out.println("全年总营业额：" + yearSum + "万元");


    }

    //计算每一个季度的营业额
    public static int mouthSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
