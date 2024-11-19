package demo2;

public class Example02 {
    public static void main(String[] args) {
        MobileShop shop = new MobileShop();
        shop.setMobileAMount(30);
        System.out.println("手机专卖店目前有"+shop.getMobileAMount()+"部手机");
        shop.purchaseMoney1.buyMobile();
        shop.purchaseMoney2.buyMobile();
        System.out.println("手机专卖店目前有"+shop.getMobileAMount()+"部手机");

    }
}
