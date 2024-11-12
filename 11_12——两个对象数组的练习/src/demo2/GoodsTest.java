package demo2;

public class GoodsTest {
    public static void main(String[] args) {
        //创建一个数组
        Goods[] arr = new Goods[3];

        //创建三个Goods对象
        Goods s1 = new Goods("001", "口红", 150, 100);
        Goods s2 = new Goods("002", "粉扑", 24, 150);
        Goods s3 = new Goods("003", "眉笔", 79, 180);

        //存入数组
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //遍历
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId()+","+goods.getName()+","+goods.getPrice()+","+ goods.getCount());
        }
    }
}
