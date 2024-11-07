package Digital;

public class DigitalDecryption {
    public static void main(String[] args) {
        //密码解密
        //反向思路
        //先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数、
        //例子；
        /*
            8   3   4   6
        反转 6   4   3   8
        %10 6   4   3   8----------可以判断这个数+5是否大于10，大于则直接-5，小于则+10-5
        -5  1   9   8   3
        加密后的结果为：8346
        */

        //已知密码，存入一个数组
        int[] code = {8, 3, 4, 6};
        //解密
        decrypt(code);
        //定义一个String型输入解密后的密码
        String decryptcode = "";
        System.out.print("解密后的密码为：");
        for (int i = 0; i < code.length; i++) {
            decryptcode += code[i];
        }
        System.out.println(decryptcode);
    }

    public static void decrypt(int[] arr) {
        //反转----定义i。j探针分别指向数组收尾元素，进行对调
        int temp = 0;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //可以判断这个数+5是否大于10，大于则直接-5，小于则+10-5
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + 5) < 10) {
                arr[i] = arr[i] + 10 - 5;
            } else {
                arr[i] = arr[i] - 5;
            }
        }
    }
}
