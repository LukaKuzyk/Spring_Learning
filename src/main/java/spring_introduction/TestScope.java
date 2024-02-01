package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Dog dog1 = context.getBean("dog",Dog.class);
        Dog dog2 = context.getBean("dog",Dog.class);

        System.out.println((dog1==dog2));
        context.close();
    }
}
