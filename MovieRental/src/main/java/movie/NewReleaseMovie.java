package movie;

import movie.costing.Costing;
import movie.costing.NewReleaseCosting;

/**
 * Created by mdhu on 5/29/17
 */
public class NewReleaseMovie implements IMovie {

    private String title;
    private Costing costing = new NewReleaseCosting();

    public NewReleaseMovie(String title) {
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
