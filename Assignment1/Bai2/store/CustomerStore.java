package bai2.store;

import bai2.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerStore {
    private static List<Customer> customers = new ArrayList<>();

    public static void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public static List<Customer> getCustomers() {
        return customers;
    }

    public void showCustomers() {
        System.out.println("Customers in store:");
        for (Customer customer : getCustomers()) {
            System.out.println(customer.getName() + " - " + customer.getPhone());
        }
    }
}