package inheritance;

public class User {
    String name = "default";
    String email = "default@google.com";
    int age;
    User(String name){
        this.name = name;
        System.out.println("Constructor Of User Class.");
    }
    void login(){
        System.out.println(name+" is logged in.");
    }
}
