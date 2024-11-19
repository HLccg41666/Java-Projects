package demo2;

public class MobileShop {
    InnerPurchaseMoney purchaseMoney1;
    InnerPurchaseMoney purchaseMoney2;
    private int mobileAMount;

    public int getMobileAMount() {
        return mobileAMount;
    }

    public void setMobileAMount(int mobileAMount) {
        this.mobileAMount = mobileAMount;
    }

    MobileShop() {
        purchaseMoney1 = new InnerPurchaseMoney(20000);
        purchaseMoney2 = new InnerPurchaseMoney(10000);

    }


    class InnerPurchaseMoney{
        int moneyValue;
        public InnerPurchaseMoney(int m){
            moneyValue = m;
        }
        public void buyMobile(){
            if(moneyValue >= 20000){
                mobileAMount = mobileAMount-6;
                setMobileAMount(mobileAMount);
                System.out.println("用价值"+moneyValue+"的内部购买券买了6部手机");
            }
            else if(moneyValue >=10000){
                mobileAMount = mobileAMount-3;
                setMobileAMount(mobileAMount);
                System.out.println("用价值"+moneyValue+"的内部购买券买了3部手机");
            }
        }
    }
}
