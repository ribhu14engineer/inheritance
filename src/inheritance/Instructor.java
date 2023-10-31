package inheritance;

public class Instructor extends User{

    Instructor(String name){
        super(name); //SuperKeywords that call the constructor of base class.
        System.out.println("Constructor of Instructor.");
    }
    void teach(){
        System.out.println(name+" is teaching");
    }
}
