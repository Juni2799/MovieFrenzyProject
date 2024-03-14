package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository extends JpaRepository<Theatre, Integer> {
}
