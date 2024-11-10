package SeniorMethod2;

public class GameCharacters {
    private String Name;
    private int blood;
    private char gender;
    private String face;

    public GameCharacters() {
    }

    public GameCharacters(String name, int blood, char gender, String face) {
        Name = name;
        this.blood = blood;
        this.gender = gender;
        this.face = face;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }


}
