package com.dome2;

interface Animal {
    public void makeSound();
}

class Dog1 implements Animal {
    public void makeSound() {
        System.out.println("汪");
    }
}

class Dog2 implements Animal {
    public void makeSound() {
        System.out.println("汪汪");
    }
}

class Dog3 implements Animal {
    public void makeSound() {
        System.out.println("汪汪汪");
    }
}

class Dog4 implements Animal {
    public void makeSound() {
        System.out.println("汪汪汪汪");
    }
}

public class ForEachCirculate {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog1();
        animals[1] = new Dog2();
        animals[2] = new Dog3();
        animals[3] = new Dog4();
        for(Animal animal : animals) {
            animal.makeSound();
        }
    }
}