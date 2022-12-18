package app.prog.prog3td2.controller.mapper;

import app.prog.prog3td2.controller.response.CreateTeamResponse;
import app.prog.prog3td2.controller.response.PlayerResponse;
import app.prog.prog3td2.controller.response.TeamResponse;
import app.prog.prog3td2.controller.response.UpdateTeamResponse;
import app.prog.prog3td2.model.SponsorEntity;
import app.prog.prog3td2.model.TeamEntity;
import app.prog.prog3td2.repository.PlayerRepository;
import app.prog.prog3td2.repository.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
public class TeamRestMapper {
    private final PlayerRepository playerRepository;
    private final SponsorRepository sponsorRepository;
    private final PlayerRestMapper playerRestMapper;
    public TeamResponse toRest(TeamEntity domain){
        List<PlayerResponse> playersList = playerRepository
                .findAllByTeam_IdOrderByNumberAsc(domain.getId())
                .stream().map(playerRestMapper::toRest)
                .toList();
        return TeamResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .players(playersList)
                .sponsors(domain.getSponsors())
                .build();
    }

    public TeamEntity toDomain(CreateTeamResponse rest){
        List<SponsorEntity> sponsorEntities = new ArrayList<>();
        for (SponsorEntity s : rest.getSponsors()){
            sponsorEntities.add(sponsorRepository
                    .findByIdAndName(s.getId(), s.getName()));
        }
        return TeamEntity.builder()
                .name(rest.getName())
                .sponsors(sponsorEntities)
                .build();
    }

    public TeamEntity toDomain(UpdateTeamResponse rest){
        List<SponsorEntity> sponsorEntities = new ArrayList<>();
        for (SponsorEntity s : rest.getSponsors()){
            sponsorEntities.add(sponsorRepository
                    .findByIdAndName(s.getId(), s.getName()));
        }
        return TeamEntity.builder()
                .id(rest.getId())
                .name(rest.getName())
                .sponsors(sponsorEntities)
                .build();
    }
}
