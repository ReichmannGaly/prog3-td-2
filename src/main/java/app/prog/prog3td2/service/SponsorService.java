package app.prog.prog3td2.service;

import app.prog.prog3td2.model.SponsorEntity;
import app.prog.prog3td2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SponsorService {
    private final SponsorRepository sponsorRepository;

    public List<SponsorEntity> getSponsors(){
        return sponsorRepository.findAll();
    }

    public List<SponsorEntity> createSponsors(List<SponsorEntity> toCreate){
        return sponsorRepository.saveAll(toCreate);
    }

    public List<SponsorEntity> updateSponsors(List<SponsorEntity> toUpdate){
        return sponsorRepository.saveAll(toUpdate);
    }
}
