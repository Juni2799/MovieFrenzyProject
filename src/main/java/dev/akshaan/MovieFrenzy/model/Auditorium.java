package dev.akshaan.MovieFrenzy.model;

import dev.akshaan.MovieFrenzy.model.constant.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    List<Seat> seats;
    @OneToMany
    List<Show> shows;

    @ElementCollection
    @Enumerated(EnumType.STRING)
    List<AuditoriumFeature> auditoriumFeatures;
}
