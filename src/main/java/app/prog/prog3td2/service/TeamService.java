package app.prog.prog3td2.service;

import app.prog.prog3td2.model.TeamEntity;
import app.prog.prog3td2.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private final TeamRepository repository;

    public List<TeamEntity> getTeams(){
        return repository.findAll();
    }

    public List<TeamEntity> createTeams(List<TeamEntity> toCreate){
        return repository.saveAll(toCreate);
    }

    public List<TeamEntity> updateTeams(List<TeamEntity> toUpdate){
        return repository.saveAll(toUpdate);
    }
}
