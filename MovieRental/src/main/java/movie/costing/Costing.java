package movie.costing;

import movie.rental.Rental;

/**
 * Created by mdhu on 5/29/17
 */
public interface Costing {
    double getRentalCost(Rental rental);

    int getRewards(Rental rental);
}
