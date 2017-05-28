package movie.costing;

import movie.rental.Rental;

/**
 * Created by mdhu on 5/29/17
 */
public class RegularMovieCosting implements Costing {
    public double getRentalCost(Rental rental) {
        double cost = 2;
        if (rental.getDaysRented () > 2)
            cost += (rental.getDaysRented () - 2) * 1.5;
        return cost;
    }

    public int getRewards(Rental rental) {
        return 1;
    }
}
