package Digital;

import java.util.Scanner;

public class DigitalEncryption {
    public static void main(String[] args) {
        //数字加密
        //某系统的数字密码（大于0），比如1983，采用加密的方式进行传输
        //规则：
        //先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数、
        //例子；
        /*
            1   9   8   3
        +5  6   14  13  8
        %10 6   4   3   8
        反转 8   3   4   6
        加密后的结果为：8346
        */
        //获取数字
        int arr1[]=getcode();
        //加密
        encrypt(arr1);
        //生成一串新数
       String code="";
       System.out.print("加密后的密码为：");
       for(int i=0;i<arr1.length;i++){
           code+=arr1[i];
       }
       System.out.println(code);
    }

    //键盘输入密码
    public static int[] getcode(){
        int[] arrcode=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入密码");
        for (int i = 0; i <arrcode.length; i++) {
            arrcode[i]=sc.nextInt();
        }
        return arrcode;
    }

    //加密
    public static void encrypt(int[] arr){
        for (int i = 0; i < arr.length; i++) {
          //加5
            arr[i]=arr[i]+5;
          //%10
            arr[i]=arr[i]%10;
        }
        //反转
        int temp=0;
        for (int i = 0,j=arr.length-1; i < j; i++,j--) {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
    }

}
