package bill;

import movie.customer.Customer;
import movie.rental.Rental;

import java.util.Enumeration;

/**
 * Created by mdhu on 5/29/17
 */
public class Biller {

    public String statement (Customer customer) {
        double              totalRentalAmount = 0;
        int                 rewardPoints = 0;
        Enumeration<Rental> rentals = customer.getRentals();
        BillPrinter billPrinter = new BillPrinter(customer.getName());
        while (rentals.hasMoreElements ()) {
            double      rentalAmount = 0;
            Rental      currentRentalItem = rentals.nextElement ();
            rentalAmount = currentRentalItem.getMovie().getCosting().getRentalCost(currentRentalItem);
            rewardPoints = rewardPoints + currentRentalItem.getMovie().getCosting().getRewards(currentRentalItem);
            billPrinter.addAmountBeakDown(rentalAmount, currentRentalItem.getMovie());
            totalRentalAmount += rentalAmount;

        }
        billPrinter.addFinalAmount(totalRentalAmount, rewardPoints);
        return billPrinter.printBill();
    }
}
