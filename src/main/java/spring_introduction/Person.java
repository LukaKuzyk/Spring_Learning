package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("personBean")
@Scope("prototype")
public class Person {

//    @Autowired
//    @Qualifier("dog")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;


    public Person(){
        System.out.println("Person has been created");
    }

//    @Autowired
//    public Person(@Qualifier("dog") Pet pet){
//        System.out.println("Person has been created");
//        this.pet = pet;
//    }
    public Person(Pet pet){
        System.out.println("Person has been created");
        this.pet = pet;
}

//    @Autowired
    public void setPet(Pet pet) {
        System.out.println("Class Person: set Pet");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet(){
        System.out.println("Hello, my pet!");
        pet.say();
    }
}
