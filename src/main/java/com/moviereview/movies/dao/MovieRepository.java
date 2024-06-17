package com.moviereview.movies.dao;

import com.moviereview.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    List<Movie> findAll(String title);
    Optional<Movie> findMovieByImdbId(String imdbId);
}
