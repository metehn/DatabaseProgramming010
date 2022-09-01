package human;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.ArrayList;

public class DepartmentPersistTest {

    public static void main(String[] args) {


        Department departmentA = new Department(0, "Muhasebe");
        departmentA.setEmployeeList(new ArrayList<Employee>());


        Employee employee1 = new Employee(0, "Metehan Ersoy", 14000);
        employee1.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee1);

        Employee employee2 = new Employee(0, "Metehan Deneme2", 11000);
        employee2.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee2);

        Employee employee3 = new Employee(0, "Deneme Deneme2", 13000);
        employee3.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee3);

        /*
        Department departmentB = new Department(0, "Satış");
        departmentB.setEmployeeList(new ArrayList<Employee>());


        Employee employee4 = new Employee(0, "Satış 1", 11100);
        employee4.setDepartment(departmentB);
        departmentB.getEmployeeList().add(employee4);

        Employee employee5 = new Employee(0, "Satış 2", 13200);
        employee5.setDepartment(departmentB);
        departmentB.getEmployeeList().add(employee5);

        Employee employee6 = new Employee(0, "Satış 3", 6600);
        employee6.setDepartment(departmentB);
        departmentB.getEmployeeList().add(employee6);
        */

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

        manager.persist(departmentA);

        manager.getTransaction().commit();

        manager.close();

    }

}
