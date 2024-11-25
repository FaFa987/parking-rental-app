package se.lexicon.data;

import se.lexicon.model.Customer;

import java.util.Collection;
import java.util.Optional;

public interface CustomerDao {

    Customer create(Customer customer) throws IllegalAccessException;

    Optional<Customer> findById(int id);

    Customer findByReservationId(int rid);

    boolean removeById(int id);

    Collection<Customer> findAll();
}