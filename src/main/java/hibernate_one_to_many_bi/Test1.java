package hibernate_one_to_many_bi;

import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
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

//            Department department = new Department("IT", 300,1200);
//            Employee emp1 = new Employee("Luka", "Kuzyk", 800);
//            Employee emp2 = new Employee("Olga", "Madar", 1000);
//            Employee emp3 = new Employee("Ivan", "Cool", 700);
//
//            department.addEmployeeToDepartment(emp1);
//            department.addEmployeeToDepartment(emp2);
//            department.addEmployeeToDepartment(emp3);
//
//            session.save(department);

//            *******************************************
            System.out.println("Get Department");
            Department department = session.get(Department.class, 4);

            System.out.println("Show Department");
            System.out.println(department);

            System.out.println("Show emps of Department");
            System.out.println(department.getEmps());

//            Employee employee = session.get(Employee.class, 4);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());

//            *******************************************
//            Employee employee = session.get(Employee.class, 4);
//            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            session.close();
            factory.close();
        }
    }
}
