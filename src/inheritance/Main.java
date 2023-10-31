package inheritance;

public class Main {

    public static void main(String[] args) {
        Instructor instructor = new Instructor("Ribhu");
        System.out.println(instructor.name);
        instructor.login();
    }
}
