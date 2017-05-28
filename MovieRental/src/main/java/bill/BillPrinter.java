package bill;

import movie.IMovie;

/**
 * Created by mdhu on 5/29/17
 */
public class BillPrinter {

    public StringBuilder itemWiseBreakDown = new StringBuilder();
    public StringBuilder finalAmount = new StringBuilder();

    public String customerName;

    public BillPrinter(String customerName) {
        this.customerName = customerName;
        setBillHeader(customerName);
    }

    private void setBillHeader(String customerName) {
        itemWiseBreakDown.append("Rental Record for ");
        itemWiseBreakDown.append(customerName);
        itemWiseBreakDown.append("\n");
    }

    public String printBill() {
        return itemWiseBreakDown.append(finalAmount.toString()).toString();
    }

    public void addAmountBeakDown(double rentalCost, IMovie movie) {
        itemWiseBreakDown.append("\t");
        itemWiseBreakDown.append(movie.getTitle ());
        itemWiseBreakDown.append("\t");
        itemWiseBreakDown.append(String.valueOf (rentalCost));
        itemWiseBreakDown.append("\n");
    }

    public void addFinalAmount(double totalRentalAmount, int rewardPoints) {
        finalAmount.append("You owed ");
        finalAmount.append( String.valueOf (totalRentalAmount));
        finalAmount.append("\n");
        finalAmount.append("You earned ");
        finalAmount.append(String.valueOf (rewardPoints));
        finalAmount.append(" frequent renter points\n");
    }
}
