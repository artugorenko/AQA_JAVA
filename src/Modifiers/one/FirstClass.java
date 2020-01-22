package one;

public class FirstClass {
    static int state=0;
    public void one(){
        System.out.println("One method");

    }

    protected void two(){
        System.out.println("Two method");

    }

    private void three(){
        System.out.println("Three method");
    }
    public void four(){
        three();
    }

    public static int state(){
        state++;
        return state;

    }
}
