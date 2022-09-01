package human;

import inventory.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class EmpleyeeQueryList {

    public static void main(String[] args) {

        long departmentId = 2L;

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("DatabaseProgramming010PU");
        EntityManager manager = factory.createEntityManager();

        //JPA-QL
        String string = "select employee from Employee as employee where employee.department.departmentId = :departmentId";
        Query query = manager.createQuery(string);
        query.setParameter("departmentId",departmentId);

        List<Employee> employeeList = query.getResultList();

        manager.close();

        for(Employee employee : employeeList){

            System.out.println(employee.getEmployeeName() + " / " +employee.getDepartment().getDepartmentName());
        }


    }

}
