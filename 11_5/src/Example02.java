public class Example02 {
    public static void main(String[] args) {
        //判断100-200之间有多少个素数，并打印所有素数
        //思路：2-99 --- 2-199
        //定义一个i（100-200），判断i是否为素数

        //定义一个count记录素数的个数
        int count = 0;

        for (int i = 101; i <= 200; i++) {

            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是素数");
                count++;
            }
        }
            System.out.println("一共有" + count + "个素数");

    }
}
