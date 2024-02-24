package hibernate_test_2;

import hibernate_test_2.entity.Detail;
import hibernate_test_2.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = new Employee("Michael", "New", "IT", 2500);
//            Detail detail = new Detail("London", "2256734688", "new@aa.com");
//
//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);
//
//            session.save(emp);

//            Detail detail = session.get(Detail.class, 3);
//            session.getTransaction().commit();
//
//            System.out.println(detail.getEmployee());
//            System.out.println("Done!");

//            session.delete(session.get(Employee.class,3));

            Detail detail = session.get(Detail.class, 5);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);


            session.getTransaction().commit();

            System.out.println("Done!");
        }finally {
            session.close();
            factory.close();
        }
    }
}
