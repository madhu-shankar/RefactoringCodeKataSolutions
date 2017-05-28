import movie.ChildrenMovie;
import movie.NewReleaseMovie;
import movie.RegularMovie;
import movie.customer.Customer;
import movie.rental.Rental;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoStoreTest
{

    @Before
    public void setUp ()  {
        customer = new Customer("Fred");
    }

    @Test
    public void testSingleNewReleaseStatement () {
        customer.addRental (new Rental(new NewReleaseMovie("The Cell"), 3));
        assertEquals ("Rental Record for Fred\n\tThe Cell\t9.0\nYou owed 9.0\nYou earned 2 frequent renter points\n", customer.statement ());
    }

    @Test
    public void testDualNewReleaseStatement () {
        customer.addRental (new Rental (new NewReleaseMovie("The Cell"), 3));
        customer.addRental (new Rental (new NewReleaseMovie("The Tigger RegularMovie"), 3));
        assertEquals ("Rental Record for Fred\n\tThe Cell\t9.0\n\tThe Tigger RegularMovie\t9.0\nYou owed 18.0\nYou earned 4 frequent renter points\n", customer.statement ());
    }

    @Test
    public void testSingleChildrensStatement () {
        customer.addRental (new Rental (new ChildrenMovie("The Tigger RegularMovie"), 3));
        assertEquals ("Rental Record for Fred\n\tThe Tigger RegularMovie\t1.5\nYou owed 1.5\nYou earned 1 frequent renter points\n", customer.statement ());
    }

    @Test
    public void testMultipleRegularStatement () {
        customer.addRental (new Rental (new RegularMovie("Plan 9 from Outer Space"), 1));
        customer.addRental (new Rental (new RegularMovie("8 1/2"), 2));
        customer.addRental (new Rental (new RegularMovie("Eraserhead"), 3));

        assertEquals ("Rental Record for Fred\n\tPlan 9 from Outer Space\t2.0\n\t8 1/2\t2.0\n\tEraserhead\t3.5\nYou owed 7.5\nYou earned 3 frequent renter points\n", customer.statement ());
    }

    private Customer customer;
}
