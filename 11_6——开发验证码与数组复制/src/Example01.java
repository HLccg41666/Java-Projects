import java.util.Random;

public class Example01 {
    public static void main(String[] args) {
     /* 需求：
        定义方法实现随机产生一个5位的验证码
        验证码格式：
        长度：5
        前四位是任意大小写字母
        最后一位是数字
     */
        //分析：a-z，A-Z
        //定义一个长度为52的char数组
        //利用random随机数去随机生成索引，调用这个char数组

        char[] chs = new char[52];
        //存入大写字母
        for (int i = 0; i < chs.length; i++) {
            if (i <= 25) {
                //存入大写字母
                chs[i] = (char) (65 + i);
            } else {
                //存入小写字母
                chs[i] = (char) (97 + i - 26);
            }
        }

        /*遍历
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + " ");
        }
        */

        String result = "";
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            int randomindex = rand.nextInt(chs.length);
            result = result + chs[randomindex];
        }
        rand.nextInt(10);
        result = result + rand.nextInt(10);
        System.out.println(result);
    }
}