package aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary{

    public void addBook(String person_name, Book book){
        System.out.println("We are taking a book from University Library: " + book.getName());
    }

    @Override
    public void getBook() {
        System.out.println("We are getting a book from Uni Library.");
        System.out.println("----------------------------------------");
    }
    public void returnBook(){
        System.out.println("We are returning book to UniLibary");
        System.out.println("----------------------------------------");
    }
    public void addBook(){
        System.out.println("We are adding a book from University Library.");
        System.out.println("----------------------------------------");
    }


    public void getMagazine(){
        System.out.println("We are getting a magazine from University Library.");
        System.out.println("----------------------------------------");
    }
    public void returnMagazine(){
        System.out.println("We are returning a magazine from University Library.");
        System.out.println("----------------------------------------");
    }
    public void addMagazine(){
        System.out.println("We are adding a magazine from University Library.");
        System.out.println("----------------------------------------");
    }


}
