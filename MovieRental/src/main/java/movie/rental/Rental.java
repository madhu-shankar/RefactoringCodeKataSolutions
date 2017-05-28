package movie.rental;

import movie.IMovie;

public class Rental
{
    private int daysRented;
    private IMovie movie;

    public Rental (IMovie movie, int daysRented) {
        this.movie      = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented () {
        return daysRented;
    }

    public IMovie getMovie () {
        return movie;
    }

}
