package app.prog.prog3td2.controller;

import app.prog.prog3td2.model.SponsorEntity;
import app.prog.prog3td2.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private final SponsorService sponsorService;

    @GetMapping("/sponsors")
    public List<SponsorEntity> getSponsors(){
        return sponsorService.getSponsors();
    }

    @PostMapping("/sponsors")
    public List<SponsorEntity> createSponsors(@RequestBody List<SponsorEntity> toCreate){
        return sponsorService.createSponsors(toCreate);
    }

    @PutMapping("/sponsors")
    public List<SponsorEntity> updateSponsor(@RequestBody List<SponsorEntity> toUpdate){
        return sponsorService.updateSponsors(toUpdate);
    }
}
