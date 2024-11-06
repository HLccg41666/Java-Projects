import java.util.Scanner;

public class Example01 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季，头等舱和经济舱收费，输入机票原价，月份和头等舱或经济舱
        按照以上规则计算机票价格并打印出来，其中旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折*/

        //键盘录入相关信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份");
        int month = sc.nextInt();
        System.out.println("请输入当前购买的舱位 0 头等舱 1 经济舱");
        int seat = sc.nextInt();

        //旺季
        if (5 <= month && month <= 10) {
            ticket = getTicket(ticket, seat, 0.9, 0.85);
        } else if ((11 <= month && month <= 12) || (1 <= month && month <= 4)) {
            ticket = getTicket(ticket, seat, 0.7, 0.65);
        } else {
            System.out.println("输入的月份不合法");
        }
        System.out.println(ticket);
    }

    //要做什么————  计算机票价钱的方法
    //需要什么————  原价，舱位，折扣
    //是否要得到数据？
    static int getTicket(int ticket, int seat, double p1, double p2) {
        if (seat == 0) {
            ticket = (int) (ticket * p1);
        } else if (seat == 1) {
            ticket = (int) (ticket * p2);
        } else {
            System.out.println("没有这个舱位");
        }
        return ticket;
    }
}