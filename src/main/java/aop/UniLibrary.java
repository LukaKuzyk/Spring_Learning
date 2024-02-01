package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary{

    public void getBook(Book book){
        System.out.println("We are taking a book from University Library: " + book.getName());
    }

//    public String returnBook(){
//        System.out.println("We are returning book to UniLibary");
//        return "ok";
//    }

    public void getMagazine(){
        System.out.println("We are taking a magazine from University Library.");
    }


}
