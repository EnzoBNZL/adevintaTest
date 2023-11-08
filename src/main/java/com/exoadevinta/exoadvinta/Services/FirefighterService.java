package com.exoadevinta.exoadvinta.Services;


import com.exoadevinta.exoadvinta.Dto.FireFighterDto;
import com.exoadevinta.exoadvinta.Entities.FireFighter;
import com.exoadevinta.exoadvinta.Repositories.FireFighterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FirefighterService {

    private final FireFighterRepo firefighterRepository;
    private final FireFighterDto fireFighterDto = new FireFighterDto();

    @Autowired
    FirefighterService(FireFighterRepo firefighterRepo) {
        firefighterRepository = firefighterRepo;
    }


   /* public FireFighterDto getNextFirefighter() {

        List<FireFighter> firefighters = firefighterRepository.findAll();
        return firefighters.stream().findFirst();
    }*/

    public FireFighterDto activationFireFighter(int id, Boolean activation) {

        FireFighter fireFighter = firefighterRepository.findById(id).get();

        if (activation) {
            fireFighter.setIsAvailable(true);
        } else {
            fireFighter.setIsAvailable(false);
        }

        return fireFighterDto.entityToDto(firefighterRepository.save(fireFighter));
    }
}
