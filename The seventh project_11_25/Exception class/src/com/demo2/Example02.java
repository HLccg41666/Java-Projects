package com.demo2;

public class Example02 {
    public static void main(String[] args) {
        System.out.println("除法运算开始");
        try{
            div(1,0);
        }catch(ArithmeticException e){
            System.out.println("处理运算异常");
        }
        System.out.println("除法运算结束");
    }

    public static int div(int x, int y)throws ArithmeticException {
        if(y==0){
            throw new ArithmeticException();
        }
        return x/y;
    }
}
