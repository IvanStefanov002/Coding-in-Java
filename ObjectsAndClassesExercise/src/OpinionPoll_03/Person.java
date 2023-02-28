package OpinionPoll_03;

public class Person {
    //полета -> описваме характеристиките на всеки един човек(примерно).
    private String name;
    private int age;

    //конструктор -> метод, чрез който ние създаваме обекти от съответния клас
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }



    //методи -> описваме действията, които може да прави всеки един човек(примерно).
}
