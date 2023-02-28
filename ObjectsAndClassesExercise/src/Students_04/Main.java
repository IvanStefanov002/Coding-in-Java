package Students_04;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> studentList = new ArrayList<>();
        int countStudents = Integer.parseInt(sc.nextLine());
        for(int s = 1; s <= countStudents; s++){
            String data = sc.nextLine();
            String firstName = data.split("\\s+")[0];
            String lastName = data.split("\\s+")[1];
            double grade = Double.parseDouble(data.split("\\s+")[2]);
            Student student = new Student(firstName, lastName, grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for(Student student : studentList){
//            System.out.println(student.getFirstName()+" "+student.getLastName()+": "+student.getGrade());
            System.out.printf("%s %s: %.2f%n", student.getFirstName(), student.getLastName(), student.getGrade());
        }
    }
}
