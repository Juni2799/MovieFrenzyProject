package dev.akshaan.MovieFrenzy.repository;

import dev.akshaan.MovieFrenzy.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
