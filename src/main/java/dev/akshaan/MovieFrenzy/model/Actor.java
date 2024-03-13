package dev.akshaan.MovieFrenzy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends BaseModel{
    private String name;
    @ManyToMany
    List<Movie> movies;
}
