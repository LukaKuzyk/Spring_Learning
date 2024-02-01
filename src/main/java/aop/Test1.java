package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Test1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);

        Book book = context.getBean("book", Book.class);
        UniLibrary uniLibrary = context.getBean("libraryBean", UniLibrary.class);
        uniLibrary.getBook(book);

//        uniLibrary.getMagazine();
//        uniLibrary.returnBook();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//
//        schoolLibrary.getBook();

        context.close();
    }
}
