package com.ArrayExercises;

class Phone{
    private String name;//品牌
    private int prize;//价格
    private String color;//颜色
    public Phone(String name, int prize, String color){
        this.name = name;
        this.prize = prize;
        this.color = color;
    }
    public Phone(){};

    public String getName(){
        return name;
    }
    public int getPrize(){
        return prize;
    }
    public String getColor(){
        return color;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrize(int prize){
        this.prize = prize;
    }
    public void setColor(String color){
        this.color = color;
    }

}

public class demo3 {
    public static void main(String[] args){
        /*定义数组存储3部手对象
        手机的属性：品牌，价格，颜色
        要求，计算出散步手机的平均价格
         */

        Phone[] phoneArray = new Phone[3];
        phoneArray[0] = new Phone("xiaomi",1999,"白色");
        phoneArray[1] = new Phone("huawei",4999,"黑色");
        phoneArray[2] = new Phone("vivo",2999,"蓝色");
        System.out.println(avg(phoneArray));
    }
    //计算平均价格
    public static double avg(Phone[] phoneArray){
        double sum = 0;
        for(int i = 0; i < phoneArray.length; i++){
            sum+=phoneArray[i].getPrize();
        }
        return sum/phoneArray.length;
    }
}
