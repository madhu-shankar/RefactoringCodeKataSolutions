package movie.costing;

import movie.rental.Rental;

/**
 * Created by mdhu on 5/29/17
 */
public class NewReleaseCosting implements Costing {
    public double getRentalCost(Rental rental) {
        return rental.getDaysRented() * 3;
    }

    public int getRewards(Rental rental) {
        int rewardPoints = 1;
        if (rental.getDaysRented () > 1)
            return rewardPoints + 1;
        return rewardPoints;
    }
}
