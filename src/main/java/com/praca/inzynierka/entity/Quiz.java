package com.praca.inzynierka.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Quiz {

    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    //@ManyToOne
    //private Student participants;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String image;

    public Quiz() {
    }

    public Quiz(String title, String description) {
        this.title = title;
        this.description = description;
//        this.participants = null;
        this.startDate = LocalDateTime.now();
        this.endDate = LocalDateTime.now();
        this.image = "";
    }

    public Quiz(String title, String description/*Student participants*/, LocalDateTime startDate, LocalDateTime endDate, String image) {
        this.title = title;
        this.description = description;
//        this.participants = participants;
        this.startDate = startDate;
        this.endDate = endDate;
        this.image = image;
    }
}
