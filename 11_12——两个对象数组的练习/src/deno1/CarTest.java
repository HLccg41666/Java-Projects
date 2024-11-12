package deno1;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        //创建一个数组来存储3个汽车对象
        Car[] arr = new Car[3];

        //键盘录入汽车对象
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车对象
            Car car = new Car();
            //录入品牌
            System.out.print("请输入汽车的品牌: ");
            String brand = sc.nextLine();
            car.setBrand(brand);
            //录入价格
            System.out.print("请输入汽车的价格: ");
            String price = sc.nextLine();
            car.setPrice(price);
            //录入颜色
            System.out.print("请输入汽车的颜色: ");
            String color = sc.nextLine();
            car.setColor(color);
            arr[i] = car;
        }
        //遍历
        for (int i = 0; i < arr.length; i++) {
            //定义一个car类型的变量接受数组的赋值
            Car car = arr[i];
            System.out.println(car.getBrand()+","+car.getPrice()+","+car.getColor());
        }
    }
}
