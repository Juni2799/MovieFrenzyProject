package dev.akshaan.MovieFrenzy.dto;

import dev.akshaan.MovieFrenzy.model.ShowSeat;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BookTicketRequestDTO {
    private Integer userId;
    private List<Integer> showSeats;
}
