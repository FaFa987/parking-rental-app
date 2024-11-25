package se.lexicon;

import se.lexicon.data.CustomerDao;
import se.lexicon.impl.CustomerDaoImpl;
import se.lexicon.model.Customer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IllegalAccessException {


        CustomerDao customerDao = new CustomerDaoImpl().getInstance();
        customerDao.create(new Customer(1,"John", "Doe" ,"df@gmail"));
        System.out.println(customerDao.findAll().size());

        CustomerDao customerDao1 = new CustomerDaoImpl().getInstance();
        System.out.println(customerDao1.findAll().size());

    }
}