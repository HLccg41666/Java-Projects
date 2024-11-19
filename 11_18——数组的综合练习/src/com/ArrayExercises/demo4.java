package com.ArrayExercises;

class boyFriends{
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public boyFriends(){};
    public boyFriends(String name, int age, String gender, String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public String getHobby(){
        return hobby;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setHobby(String hobby){
        this.hobby = hobby;
    }
}

public class demo4 {
    public static void main(String[] args) {
        /*定义数组存储4个男朋友的对象
        男朋友的属性：姓名，年龄，性别，爱好
        要求1：计算出平均年龄
        要求2：统计年龄比平均年龄低的男朋友有几个？并打印出来
         */
        //定义一个数组存储四个boyfriend
        boyFriends[] boyArray = new boyFriends[4];
        //直接构造boyFriend类的对象并存入数组
        boyArray[0] = new boyFriends("niko", 18, "male", "打篮球");
        boyArray[1] = new boyFriends("donk", 22, "male", "踢足球");
        boyArray[2] = new boyFriends("danking", 24, "male", "打排球");
        boyArray[3] = new boyFriends("wondeful", 29, "male", "打冰球");
        //调用计算平均年龄方法
        double avgAge = avg(boyArray);
        //打印平均年龄
        System.out.println(avgAge);
        //打印contain，统计小于平均年龄的人数
        contain(boyArray,avgAge);
    }
    public static double avg(boyFriends[] boyArray){
        double sum = 0;
        for( int i=0; i<boyArray.length; i++){
          sum += boyArray[i].getAge();
        };
        return sum/boyArray.length;
    }

    public static void contain(boyFriends[] boyArray,double avgAge){
        int count = 0;
        for( int i=0; i<boyArray.length; i++){
            if(boyArray[i].getAge() < avgAge){
                count++;
            }
        }
        System.out.println(count);
    }
}
