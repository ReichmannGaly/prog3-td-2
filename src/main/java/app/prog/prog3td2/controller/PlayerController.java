package app.prog.prog3td2.controller;

import app.prog.prog3td2.controller.mapper.PlayerRestMapper;
import app.prog.prog3td2.controller.response.CreatePlayerResponse;
import app.prog.prog3td2.controller.response.PlayerResponse;
import app.prog.prog3td2.controller.response.UpdatePlayerResponse;
import app.prog.prog3td2.model.PlayerEntity;
import app.prog.prog3td2.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService playerService;
    private final PlayerRestMapper playerRestMapper;

    @GetMapping("/players")
    public List<PlayerResponse> getPlayers(){
        return playerService.getPlayers()
                .stream()
                .map(playerRestMapper::toRest)
                .toList();
    }

    @PostMapping("/players")
    public List<PlayerResponse> createPlayers(
            @RequestBody List<CreatePlayerResponse> toCreate){
        List<PlayerEntity> domain = toCreate
                .stream()
                .map(playerRestMapper::toDomain)
                .toList();
        return playerService.createPlayers(domain)
                .stream()
                .map(playerRestMapper::toRest)
                .toList();
    }

    @PutMapping("/players")
    public List<PlayerResponse> updatePlayers(
            @RequestBody List<UpdatePlayerResponse> toUpdate
    ){
        List<PlayerEntity> domain = toUpdate
                .stream()
                .map(playerRestMapper::toDomain)
                .toList();
        return playerService.updatePlayers(domain)
                .stream()
                .map(playerRestMapper::toRest)
                .toList();
    }
}
