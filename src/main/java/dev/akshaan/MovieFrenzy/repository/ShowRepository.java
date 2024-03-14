package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer> {
}
