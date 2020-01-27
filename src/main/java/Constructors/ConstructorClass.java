package Constructors;

public class ConstructorClass {
    ConstructorClass(){
        System.out.println(this.getClass().getSimpleName());
    }
    ConstructorClass(String create){
        System.out.println(this.getClass().getSimpleName()+" создал - "+ create);
    }
}

