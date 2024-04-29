package OOPInheritance;

import java.time.LocalDateTime;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeManager employeeManager = new EmployeeManager();

        List<Employee> employeeList = employeeManager.getAll();

        Employee employee = new Employee();
        employee.setId(2);
        employee.setFirstName("Selo");
        employee.setLastName("İscan");
        employee.setDepartment("Mühendis");

        employeeManager.addEmployee(employee, LocalDateTime.now());

        System.out.println("Listedeki kişiler:");
        for (Employee employee1:employeeList){
            System.out.println("Id:" + employee1.getId() + " Adı ve Soyadı:" + employee1.getFirstName() + " " +
                    employee1.getLastName() + " Bölüm:" + employee1.getDepartment() +
                    " Eklenme zamanı: " + employee.getCreatedDate());
        }

        System.out.println("------------------------");
        System.out.println("Id'ye göre listeyi sıralama");
        //for (Employee employee1:employeeList){
        System.out.println("Listede 1 numaralı ID'ye sahip kişi: " + employeeManager.getById(1).getFirstName());


        System.out.println("---------------");
        System.out.println("Listeden 1 kişiyi güncelleme");


        Employee updateEmployee = new Employee();
        updateEmployee.setId(1);
        updateEmployee.setFirstName("Sena");
        updateEmployee.setLastName("İnce");

        employeeManager.updateEmployee(updateEmployee,LocalDateTime.now());

        for (Employee employee1:employeeList){
            System.out.println("Id:" + employee1.getId() + " Adı ve Soyadı:" + employee1.getFirstName() + " " +
                    employee1.getLastName() + " Bölüm:" + employee1.getDepartment() +
                    " Güncellenme tarihi: " + employee1.getUpdatedDate());
        }

        System.out.println("----------------------");
        System.out.println("Listeden 1 kişi silinirse:");

        employeeManager.deleteEmployee(1, LocalDateTime.now());
        for (Employee employee1:employeeList){
            System.out.println("Id:" + employee1.getId() + " Adı ve Soyadı:" + employee1.getFirstName() + " " +
                    employee1.getLastName() + " Bölüm:" + employee1.getDepartment() +
                    " Silinme tarihi: " + employee1.getDeletedDate());
        }

    }
}
