package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {
}
