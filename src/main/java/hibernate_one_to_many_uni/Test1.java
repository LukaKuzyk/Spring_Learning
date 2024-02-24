package hibernate_one_to_many_uni;

import hibernate_one_to_many_uni.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Department department = new Department("HR", 500,1500);
//            Employee emp1 = new Employee("Vova", "Baran", 760);
//            Employee emp2 = new Employee("Oksana", "Flower", 1000);
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            session.save(department);

//            Department department = session.get(Department.class, 2);
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(department);
//            System.out.println(department.getEmps());

//            *******************************************
//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);

            Department department = session.get(Department.class, 3);
            session.delete(department);


            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            session.close();
            factory.close();
        }
    }
}
