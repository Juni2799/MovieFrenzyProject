package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
