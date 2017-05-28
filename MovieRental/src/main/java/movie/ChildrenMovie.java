package movie;

import movie.costing.ChildrenMovieCosting;
import movie.costing.Costing;

/**
 * Created by mdhu on 5/29/17
 */
public class ChildrenMovie implements IMovie {

    private String title;
    private Costing costing = new ChildrenMovieCosting();

    public ChildrenMovie(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public Costing getCosting() {
        return costing;
    }
}
