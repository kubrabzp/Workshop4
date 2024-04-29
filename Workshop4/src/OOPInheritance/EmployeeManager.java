package OOPInheritance;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeManager {

    private List<Employee> employees;

    public EmployeeManager(){

        employees = new ArrayList<>();

        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Bengu");
        employee.setLastName("Seker");
        employee.setEmail("bengu@etiya.com");
        employee.setDepartment("Test");

        employees.add(employee);
    }

    public List<Employee> getAll(){
        return employees;
    }

    public Employee getById(int id){
        for (Employee employee:employees){
            if (employee.getId() == id){
                return employee;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee, LocalDateTime createdTime){
        employee.setCreatedDate(createdTime);
        employees.add(employee);
    }

    public void deleteEmployee(int id, LocalDateTime deletedTime){
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()){
            Employee employee = employeeIterator.next();
            if (employee.getId() == id ){
                employee.setDeletedDate(deletedTime);
                employeeIterator.remove();
            }
        }
    }

    public void updateEmployee(Employee employee, LocalDateTime updatedTime){
        for (Employee updateEmployee:employees){
            if (updateEmployee.getId() == employee.getId()){
                updateEmployee.setId(employee.getId());
                updateEmployee.setFirstName(employee.getFirstName());
                updateEmployee.setLastName(employee.getLastName());
                updateEmployee.setUpdatedDate(updatedTime);
            }
        }
    }
}
