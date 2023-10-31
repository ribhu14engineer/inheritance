package constructors;

public class Student
{
    public String name;
    private int id;
    private int totalProblemSolved;
    public Performance performance;
    public Student(String name, int id, int totalProblemSolved, Performance performance){
        this.name = name;
        this.id = id;
        this.totalProblemSolved = totalProblemSolved;
        this.performance = performance;
    }

    //Copy Constructor
    public Student(Student other){
        this.name = other.name;
        this.id = other.id;
        this.totalProblemSolved = other.totalProblemSolved;
        this.performance = new Performance(other.performance); //Deep Copy
    }
}
