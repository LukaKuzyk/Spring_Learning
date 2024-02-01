package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");



//        Pet pet = context.getBean("MyPet", Pet.class);
//        Pet pet = new Dog();


        Person person = context.getBean("MyPerson", Person.class);

        System.out.println(person.getSurname() + "  " + person.getAge() );
        person.callYourPet();

        context.close();
    }
}
