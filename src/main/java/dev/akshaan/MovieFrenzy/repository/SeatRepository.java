package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Integer> {
}
