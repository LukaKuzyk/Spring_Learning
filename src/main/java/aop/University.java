package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("luka", 4,4.1f);
        Student st2 = new Student("ivan", 5,2.1f);
        Student st3 = new Student("vanko", 3,3.6f);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Info about students:");
        System.out.println(students);
        return students;
    }
}
