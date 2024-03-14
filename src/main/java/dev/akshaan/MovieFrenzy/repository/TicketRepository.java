package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
