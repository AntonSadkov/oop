package main.polymorphism;

public class ClassB extends ClassParent {

    @Override
    public void outputText() {
        System.out.println("Я класс Б.");
    }

    public void outputText(String text) {
        System.out.println("Я родительский класс. " + text);
    }
}
