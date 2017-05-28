package movie.costing;

import movie.rental.Rental;

/**
 * Created by mdhu on 5/29/17
 */
public class ChildrenMovieCosting implements Costing{
    public double getRentalCost(Rental rental) {
        double cost = 1.5;
        if (rental.getDaysRented () > 3)
            cost += (rental.getDaysRented () - 3) * 1.5;
        return cost;
    }

    public int getRewards(Rental rental) {
        return 1;
    }
}
