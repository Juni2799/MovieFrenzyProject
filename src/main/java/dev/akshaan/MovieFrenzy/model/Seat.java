package dev.akshaan.MovieFrenzy.model;

import dev.akshaan.MovieFrenzy.model.constant.SeatStatus;
import dev.akshaan.MovieFrenzy.model.constant.SeatType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int rowSeat, colSeat;
    private String seatNumber;

    @Enumerated(EnumType.STRING)
    SeatStatus seatStatus;
    @Enumerated(EnumType.STRING)
    SeatType seatType;
}
