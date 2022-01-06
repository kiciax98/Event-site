package com.praca.inzynierka.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Date;

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
    private Date startDate;
    private Date endDate;
    private String image;

    public Quiz() {
    }

    public Quiz(String title, String description) {
        this.title = title;
        this.description = description;
//        this.participants = null;
        this.startDate = new Date();
        this.endDate = new Date();
        this.image = "";
    }

    public Quiz(String title, String description/*Student participants*/, Date startDate, Date endDate, String image) {
        this.title = title;
        this.description = description;
//        this.participants = participants;
        this.startDate = startDate;
        this.endDate = endDate;
        this.image = image;
    }
}
