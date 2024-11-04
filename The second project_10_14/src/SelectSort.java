public class SelectSort {
    public static void sort(int[] arr){
        //冒泡法排序进行数据排序
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        //输出方法实现输出排序前数组
        System.out.println("选择排序前，数组为:");
        System.out.printf("[");
        for(int i=0;i<arr.length;i++) {
            System.out.printf(" %d ",arr[i]);
        }
        System.out.printf("]");
        System.out.println();

        sort(arr);//调用sort排序方法

        //输出方法实现输出排序后数组
        System.out.println("选择排序后，数组为:");
        System.out.printf("[");
        for(int i=0;i<arr.length;i++) {
            System.out.printf(" %d ",arr[i]);
        }
        System.out.printf("]");
        System.out.println();
    }
}

