package accessModifier;

public class Box {
    public int width = 1;
    //No Access modifier -> default -> Package Private
    static void printMe(){
        System.out.println("I am a box.");
    }
    int height = 2;
    public int breadth = 3;
}
