package project03;

interface Animal {
    public void sleep();
}

class Cat implements Animal {
    public void catMouse() {
        System.out.println("抓老鼠");
    }

    public void sleep() {
        System.out.println("Cat睡觉");
    }
}

class Dog implements Animal {
    public void sleep() {
        System.out.println("Dog睡觉");
    }
}
