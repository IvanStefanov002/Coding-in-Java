package OpinionPoll_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> persons_list = new ArrayList<>();

        int n = Integer.parseInt(sc.nextLine());
        for(int p = 1; p <= n; p++){
            String data = sc.nextLine();
            String name = data.split("\\s+")[0];
            int age = Integer.parseInt((data.split("\\s+")[1]));
            if(age>30){
                Person person = new Person(name, age);
                persons_list.add(person);
            }
        }
        for(Person person : persons_list){
            System.out.println(person.getName()+" - "+person.getAge());
        }
    }
}
