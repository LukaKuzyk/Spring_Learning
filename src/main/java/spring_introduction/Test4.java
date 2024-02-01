package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//Singelton & Prototype scope
public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog dog1 = context.getBean("MyPet", Dog.class);
//        dog1.setName("Mozart");
//        Dog dog2 = context.getBean("MyPet", Dog.class);
//        dog2.setName("Orishok");
//
//        System.out.println(dog1.getName());
//        System.out.println(dog2.getName());


        context.close();
    }
}
