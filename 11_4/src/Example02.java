class Bank {
    int savedMoney;//存款
    int year;//年份
    double interest;//利息
    double interestRate = 0.29;//增长速率

    //计算利息的方法
    public double computerInterest() {
        interest = year * interestRate * savedMoney;
        return interest;
    }

    //增长速率的方法
    public void setInterestRate(double rate) {
        this.interestRate = rate;
    }
}

//定义一个Bank的子类ConstructBank类
class ConstructBank extends Bank {
    double year;

    public double computerInterest() {
        super.year = (int) year;
        double r = year - (int) year;
        int day = (int) (r * 1000);
        double yearInterest = super.computerInterest();
        double dayInterest = day * 0.0001 * savedMoney;
        interest = yearInterest + dayInterest;
        System.out.printf("%d 元在建设银行%d年零%d天的利息：%f元\n", savedMoney, super.year, day, interest);
        return interest;
    }
}

class BankOfDalian extends Bank {
    double year;

    public double computerInterest() {
        super.year = (int) year;
        double r = year - (int) year;
        int day = (int) (r * 1000);
        double yearInterest = super.computerInterest();
        double dayInterest = day * 0.00012 * savedMoney;
        interest = yearInterest + dayInterest;
        System.out.printf("%d元在建设银行%d年零%d天的利息：%f元\n", savedMoney, super.year, day, interest);
        return interest;
    }
}

public class Example02 {
    public static void main(String[] args) {
        int amount = 8000;
        ConstructBank construct = new ConstructBank();
        construct.savedMoney = amount;
        construct.year = 8.236;
        construct.setInterestRate(0.035);
        double interest1 = construct.computerInterest();
        BankOfDalian bank = new BankOfDalian();
        bank.savedMoney = amount;
        bank.year = 8.236;
        bank.setInterestRate(0.035);
        double interest2 = bank.computerInterest();
        System.out.printf("两个银行利息相差%f元\n", interest2 - interest1);
    }
}
