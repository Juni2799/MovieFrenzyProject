package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.Auditorium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuditoriumRepository extends JpaRepository<Auditorium, Integer> {
}
