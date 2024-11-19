package demo3;

public class ComplexNumberTest {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3,4);
        ComplexNumber c2 = new ComplexNumber(1,-2);

        ComplexNumber sum = c1.add(c2);
        System.out.println("Sum: "+sum);

        ComplexNumber difference = c2.subtract(c1);
        System.out.println("Difference: "+difference);
    }
}
