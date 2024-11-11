package project04;

interface ComputerAverage {
    public abstract double average(double[] x);
}

class Gymnastics implements ComputerAverage {
    public double average(double[] x) {
        int count = x.length;
        double aver = 0.0, temp = 0.0;
        //由小到大排序
        for (int i = 0; i < count; i++) {
            for (int j = i; j < count; j++) {
                if (x[i] > x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        //去除最大值和最小值求平均数
        for (int i = 1; i < count - 1; i++) {
            aver = aver + x[i];
        }
        if (count > 2) {
            aver = aver / (count - 2);
        } else
            aver = 0;
        return aver;
    }
}

class School implements ComputerAverage {
    public double average(double[] x) {
        int count = x.length;
        double aver = 0.0;
        for (int i = 0; i < count; i++) {
            aver = aver + x[i];
        }
        return aver / count;
    }
}