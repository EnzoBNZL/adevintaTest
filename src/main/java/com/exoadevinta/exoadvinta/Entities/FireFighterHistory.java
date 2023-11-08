package com.exoadevinta.exoadvinta.Entities;

import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class FireFighterHistory {


    @Id
    private int id;

    @DateTimeFormat(pattern = "yyyy-MM-dd-HH:mm:ss")
    Date date;

    @OneToMany
    private List<FireFighter> fireFighters;




}
