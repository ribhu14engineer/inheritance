// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import constructors.*;
public class Main {
    public static void main(String[] args) {

        Performance p1 = new Performance();

        Student s1 = new Student("Chirag",10,50, p1);
        Student s2 = new Student(s1);

        System.out.println(s1.performance.marks);
        s2.performance.marks = 100;
        System.out.println(s1.performance.marks);
    }
}
