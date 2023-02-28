package Students_04;

public class Student {
    private String firstName;
    private String lastName;
    private double grade;

    public Student(String fn, String ln, double grade){
        this.firstName = fn;
        this.lastName = ln;
        this.grade = grade;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public double getGrade(){
        return this.grade;
    }
}
