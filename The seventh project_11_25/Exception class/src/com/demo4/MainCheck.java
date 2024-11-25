package com.demo4;

public class MainCheck {
    public static void main(String[] args) {
        Machine machine = new Machine();
        String[] name = {"苹果","炸药","西服","硫酸","手表","硫磺"};
        Goods[] goods = new Goods[name.length];
        for(int i = 0; i < name.length; i++){
            goods[i] = new Goods();
            if(i%2==0){
                goods[i].setName(name[i]);
                goods[i].setDanger(false);
            }
            else{
                goods[i].setName(name[i]);
                goods[i].setDanger(true);
            }
        }
        for(int i = 0; i < goods.length; i++){
            try{
                machine.checkBag(goods[i]);
                System.out.println(goods[i].getName()+"通过检查");
            }catch(DangerException e){
                e.toShow();
                System.out.println(goods[i].getName()+"被禁止！");
            }
        }
    }
}
