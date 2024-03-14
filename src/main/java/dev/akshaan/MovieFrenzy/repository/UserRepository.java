package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
