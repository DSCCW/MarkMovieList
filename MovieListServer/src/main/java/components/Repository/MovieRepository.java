package components.Repository;

import components.Service.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    /**
     * Jpa queries can be made by naming the method with certain keywords.
     * In this case, Top10ByRevenue will give me the top 10 movies according to their revenue.
     */
    List<Movie> findTop10TopByRevenue();

    /**
     * Same case as the above for the name, but the query also needs to specifically search only the movies for the given year.
     */
    @Query("select i from Movie i order by i.revenue where i.year = :year")
    List<Movie> findTop10ByRevenueByYear(int year);

}


