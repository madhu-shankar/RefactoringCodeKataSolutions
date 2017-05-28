package movie;

import movie.costing.Costing;

/**
 * Created by mdhu on 5/29/17
 */
public interface IMovie {

    String getTitle ();

    Costing getCosting();
}
