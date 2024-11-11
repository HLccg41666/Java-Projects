package project04;

public class Example04 {
    public static void main(String[] args) {
        double a[] = {9.89, 9.88, 9.99, 9.12};
        double b[] = {89, 56, 78, 90};
        ComputerAverage computer;
        computer = new Gymnastics();
        double result = computer.average(a);
        System.out.printf("%n");
        System.out.printf("体操选手最后得分：%5.3f%n", result);
        computer = new School();
        result = computer.average(b);
        System.out.printf("班级考试平均分是: %5.2f%n", result);

    }
}
