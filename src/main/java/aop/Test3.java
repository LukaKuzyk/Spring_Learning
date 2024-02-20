package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
        UniLibrary library = context.getBean("libraryBean", UniLibrary.class);
        String bookName = library.returnBook();

        System.out.println("Book was returned: " + bookName);

        context.close();
        System.out.println("Method main ends");
    }
}
