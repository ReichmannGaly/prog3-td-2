package app.prog.prog3td2.service;

import app.prog.prog3td2.model.PlayerEntity;
import app.prog.prog3td2.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public List<PlayerEntity> getPlayers(){
        return playerRepository.findAll();
    }

    public List<PlayerEntity> createPlayers(List<PlayerEntity> toCreate){
        return playerRepository.saveAll(toCreate);
    }

    public List<PlayerEntity> updatePlayers(List<PlayerEntity> toUpdate){
        return playerRepository.saveAll(toUpdate);
    }
}
