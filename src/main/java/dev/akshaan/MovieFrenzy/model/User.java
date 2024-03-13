package dev.akshaan.MovieFrenzy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "MF_USER")
public class User extends BaseModel{
    private String name;
    private String email;
    @OneToMany
    private List<Ticket> tickets;
}
