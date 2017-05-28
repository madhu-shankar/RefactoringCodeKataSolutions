package movie;

import movie.costing.Costing;
import movie.costing.RegularMovieCosting;

public class RegularMovie implements IMovie {
    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private Costing costing = new RegularMovieCosting();

    public RegularMovie(String title) {
        this.title      = title;
    }

    @Override
    public String getTitle () {
        return title;
    }

    @Override
    public Costing getCosting() {
        return costing;
    }

}
