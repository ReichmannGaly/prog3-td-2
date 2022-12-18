package app.prog.prog3td2.service;

import app.prog.prog3td2.model.MatchEntity;
import app.prog.prog3td2.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
    private final MatchRepository matchRepository;

    public List<MatchEntity> getMatches(){
        return matchRepository.findAll();
    }

    public List<MatchEntity> createMatches(List<MatchEntity> toCreate){
        return matchRepository.saveAll(toCreate);
    }

    public List<MatchEntity> updateMatches(List<MatchEntity> toUpdate){
        return matchRepository.saveAll(toUpdate);
    }
}
