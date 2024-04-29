package OOPInheritance;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerManager {

    private List<Customer> customers;

    public CustomerManager(){

        customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setId(1);
        customer.setFirstName("kübra");
        customer.setLastName("bozalp");
        customer.setEmail("kubra@etiya.com");
        customer.setPhoneNumber(5556667788L);

        customers.add(customer);

    }

    public List<Customer> getAll(){
        return customers;
    }

    public Customer getById(int id){
        for (Customer customer:customers){
            if (customer.getId() == id){
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public void deleteCustomer(int id){
        Iterator<Customer> customerIterator = customers.iterator();
        while (customerIterator.hasNext()){
            Customer customer = customerIterator.next();
            if (customer.getId() == id){
                customerIterator.remove();
            }
        }
    }

    public void updateCustomer(Customer customer){
        for (Customer updateCustomer:customers){
            if (updateCustomer.getId() == customer.getId()){
                updateCustomer.setId(customer.getId());
                updateCustomer.setFirstName(customer.getFirstName());
                updateCustomer.setLastName(customer.getLastName());
            }
        }
    }


}
