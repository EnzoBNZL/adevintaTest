package com.exoadevinta.exoadvinta.Controller;

import com.exoadevinta.exoadvinta.Dto.FireFighterDto;
import com.exoadevinta.exoadvinta.Services.FirefighterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/firefighters")
public class FirefighterController {

    private FirefighterService firefighterService;

    @Autowired
    FirefighterController(FirefighterService firefighterServ){
        firefighterService = firefighterServ;
    }

    @GetMapping("/next")
    public FireFighterDto getNextFirefighter() {
        return firefighterService.getNextFirefighter();
    }

    @GetMapping("/history")
    public List<FireFighterHistoryDto> getFireFighterGlobalHistory() {
        return firefighterService.getFireFighterGlobalHistory();
    }

    @GetMapping("/history/{id}")
    public FireFighterHistoryDto getFireFighterHistory(@PathVariable int id) {
        return firefighterService.getNextFirefighterGlobalHistory();
    }

    @PutMapping("/desactivate/{id}")
    public FireFighterDto desactivateFireFighter(@PathVariable int id) {
        return firefighterService.activationFireFighter(id, false);
    }
    @PutMapping("/activate/{id}")
    public FireFighterDto activateFireFighter(@PathVariable int id) {
        return firefighterService.activationFireFighter(id, true);
    }


}
