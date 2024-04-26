package components.Repository;

import components.Service.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

    List<Movie> findTopRevenue();

    List<Movie> findTopRevenueByYear(int year);

}


