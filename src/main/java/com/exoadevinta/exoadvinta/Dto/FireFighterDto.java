package com.exoadevinta.exoadvinta.Dto;

import com.exoadevinta.exoadvinta.Entities.FireFighter;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FireFighterDto {
    private int id;
    private String nom;
    private String team;
    private Boolean isAvailable;



    public FireFighter DtoToEntity(FireFighterDto fireFighterDto){

        FireFighter fireFighter = new FireFighter();

        fireFighter.setId(fireFighterDto.getId());
        fireFighter.setNom(fireFighterDto.getNom());
        fireFighter.setTeam(fireFighterDto.getTeam());
        fireFighter.setIsAvailable(fireFighterDto.getIsAvailable());

        return fireFighter;
    }

    public FireFighterDto entityToDto(FireFighter fireFighter){

       FireFighterDto fireFighterDto = new FireFighterDto();

         fireFighterDto.setId(fireFighter.getId());
         fireFighterDto.setNom(fireFighter.getNom());
         fireFighterDto.setTeam(fireFighter.getTeam());
         fireFighterDto.setIsAvailable(fireFighter.getIsAvailable());

        return fireFighterDto;
    }

}
