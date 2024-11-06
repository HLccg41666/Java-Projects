public class Example02 {
    public static void main(String[] args) {
        //把旧数组arr的元素复制到新数组newarr中
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] newarr = new int[arr.length];

        //打印旧数组 并把旧数组复制给新数组
        System.out.println("打印旧数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            newarr[i] = arr[i];
        }

        //打印新数组
        System.out.println();
        System.out.println("打印新数组");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
}
