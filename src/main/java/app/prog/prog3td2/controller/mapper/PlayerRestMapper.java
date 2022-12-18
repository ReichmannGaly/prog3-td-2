package app.prog.prog3td2.controller.mapper;

import app.prog.prog3td2.controller.response.CreatePlayerResponse;
import app.prog.prog3td2.controller.response.PlayerResponse;
import app.prog.prog3td2.controller.response.UpdatePlayerResponse;
import app.prog.prog3td2.model.PlayerEntity;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerResponse toRest(PlayerEntity domain){
        return PlayerResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .build();
    }

    public PlayerEntity toDomain(CreatePlayerResponse rest){
        return PlayerEntity.builder()
                .name(rest.getName())
                .build();
    }

    public PlayerEntity toDomain(UpdatePlayerResponse rest){
        return PlayerEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .build();
    }
}
