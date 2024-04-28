package com.movieList.Repository;

import com.movieList.Service.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    /**
     * Jpa queries can be made by naming the method with certain keywords.
     * In this case, Top10ByRevenue will give me the top 10 movies according to their revenue.
     */
    List<Movie> findTop10ByOrderByRevenueDesc();

    /**
     * Same case as the above for the name, but the query also needs to specifically search only the movies for the given year.
     */
    @Query("select i from Movie i where i.releaseYear = :year order by i.revenue DESC")
    List<Movie> findTop10ByYearOrderByRevenueDesc(@Param("year") int year);

}


