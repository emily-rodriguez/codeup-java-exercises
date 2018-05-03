import java.sql.SQLOutput;

public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello " + name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person emily = new Person("Emily");

        System.out.println(emily.getName());

        emily.setName("Emily Rodriguez");

        System.out.println(emily.getName());

        emily.sayHello();

        System.out.println("=========");
        System.out.println("Question 2");

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());


    }
}
