package demo3;

public class ComplexNumber {
    private double real;//实部
    private double imaginary;//虚部
    //有参构造方法
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    //加法运算
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    //减法运算
    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    //转换成字符串形式表示----重写了object的toString方法
    public String toString(){
        if (imaginary > 0){
            return real + " + " + imaginary + "i";
        } else if (imaginary<0) {
            return real + " - " + -imaginary + "i";
        }else {
            return String.valueOf(real);
        }
    }
}
