package std3.dome5;

class Resume{
    private String name;
    private String preference;
    private int age;
    void getResume(String name, String preference, int age){
        this.name = name;
        this.preference = preference;
        this.age = age;
    }
    void introduce(){
        System.out.println("Name: " + name);
        System.out.println("Preference: " + preference);
        System.out.println("Age: " + age);
    }
}

public class Example05 {
    public static void main(String[] args) {
        Resume resume1 = new Resume();
        resume1.getResume("李四","篮球",18);
        resume1.introduce();
    }
}
