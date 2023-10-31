package inheritance;

public class Students extends User{
    public Students(String name) {
        super(name);
    }

    void solveProblem(){
        System.out.println(name+" is solving problems.");
    }
}
