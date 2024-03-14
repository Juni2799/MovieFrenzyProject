package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.ShowSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Integer> {
}
