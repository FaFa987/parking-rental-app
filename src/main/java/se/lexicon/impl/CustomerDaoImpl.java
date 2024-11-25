package se.lexicon.impl;

import se.lexicon.data.CustomerDao;
import se.lexicon.model.Customer;

import java.util.*;

public class CustomerDaoImpl implements CustomerDao {

    private final List<Customer> storage;

    private static CustomerDaoImpl instance;
    public static CustomerDaoImpl getInstance() {
        if (instance == null) {
            instance = new CustomerDaoImpl();
        }
        return instance;
    }

    public CustomerDaoImpl() {
        this.storage = new ArrayList<>();
    }

    @Override
    public Customer create(Customer customer) throws IllegalAccessException {

        if (customer == null) throw new IllegalAccessException("Customer was null!");
        if (storage.contains(customer)) throw new IllegalAccessException("Customer already exists!");

        storage.add(customer);
        return customer;
    }

    @Override
    public Optional<Customer> findById(int id) {
        for (Customer c : storage) {
            if (c.getId() == id)
                return Optional.of(c);
        }
        return Optional.empty();
    }

    @Override
    public Customer findByReservationId(int rid) {

        for (Customer c : storage) {

            if (c.getReservation() == null){
                continue;
            }
            if(c.getReservation().getId() == rid){
                return c;
            }
        }
        return null;
    }

    @Override
    public boolean removeById(int id) {
        Optional<Customer> found = findById(id);
        if (found.isPresent()) {
            return storage.remove(found.get());
        }
        return false;
    }

    @Override
    public Collection<Customer> findAll() {
        return Collections.unmodifiableCollection(storage);
    }
}
