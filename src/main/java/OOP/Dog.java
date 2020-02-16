package OOP;

public class Dog implements AnimalInterface {

    @Override
    public float height() {
        return 1;
    }
    public String height(String str) {
        return "1"+str;
    }


    @Override
    public float weight() {
        return 1;
    }
    public String weight(String str) {
        return "1"+str;
    }
    @Override
    public String move() {
        return "Move";
    }
    public String move(int a) {
        return "Move"+a;
    }

    @Override
    public boolean thereIs() {
        return true;
    }


}
