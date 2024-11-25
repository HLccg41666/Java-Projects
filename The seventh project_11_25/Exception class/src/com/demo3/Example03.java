package com.demo3;

public class Example03 {
    public static void main(String[] args) {
        try{
            int number = divide(20,0);
            System.out.println(number);
        }catch(MyException e){
            System.out.println("你给的除数是:"+e.getNumber()+",而我们的要求是:"+e.getMessage());
        }
    }
    public static int divide(int x, int y)throws MyException {
        if(y==0){
            throw new MyException(y,"除数不能为零");
        }
        return x/y;
    }
}
