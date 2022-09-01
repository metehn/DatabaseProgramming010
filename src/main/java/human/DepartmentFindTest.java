package human;

import inventory.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DepartmentFindTest {

    public static void main(String[] args) {

        long departmentId = 1L;


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();


        Department department  = manager.find(Department.class, departmentId);

        manager.close();

        System.out.println(department.getDepartmentName()+ "\n");

        for(Employee employee : department.getEmployeeList()){
            System.out.println(employee.getEmployeeName());
        }

    }

}
