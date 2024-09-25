package bai2.store;

import bai2.entities.Cart;
import bai2.entities.Customer;

import java.util.ArrayList;
import java.util.List;

public abstract class Store {

    public abstract void checkout(Customer customer, Cart cart);
}