package ru.medovikov.springcourse.springapp1;

public class ClassicalMusic implements Music{
    int s;
    private ClassicalMusic (){}

    public static ClassicalMusic factoryMethod(){
        return new ClassicalMusic();
    }
    public void doMiInit(){
        System.out.println("DoMyInit");
    }

    public void doMyDestroy(){
        System.out.println("DoMyDestroy");
    }
    @Override
    public String getSong() {
        return "Mozhart";
    }
}
