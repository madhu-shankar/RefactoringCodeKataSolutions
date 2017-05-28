package movie.customer;

import bill.Biller;
import movie.rental.Rental;

import java.util.Enumeration;
import java.util.Vector;

public class Customer
{
    private String name;
    private Vector<Rental> rentals = new Vector<Rental> ();
    //TODO add reward points as field

    public Customer (String name) {
        this.name = name;
    }

    public Enumeration<Rental> getRentals() {
        return rentals.elements();
    }

    public void addRental (Rental rental) {
        rentals.addElement (rental);
    }

    public String getName () {
        return name;
    }

    public String statement () {
        return new Biller().statement(this);
    }
}
