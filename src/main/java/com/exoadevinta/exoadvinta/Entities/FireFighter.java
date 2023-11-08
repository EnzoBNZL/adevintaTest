package com.exoadevinta.exoadvinta.Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
public class FireFighter {

        @Id
        private int id;
        private String nom;
        private String team;
        private Boolean isAvailable;
        private Boolean isCurrentFireFighter;

        @ManyToOne
        @JoinColumn(name = "fireFighterHistory_id")
        private FireFighterHistory fireFighterHistory;

}
