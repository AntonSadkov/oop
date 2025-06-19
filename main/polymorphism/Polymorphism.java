package main.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        ClassParent textA = new ClassA();
        ClassParent textB = new ClassB();
        ClassParent textParent = new ClassParent();

        textParent.outputText();
        textA.outputText();
        textA.outputText("Добавление текста с помощью класса A.");
        textB.outputText();
        textB.outputText("Добавление текста с помощью класса Б.");
    }
}
