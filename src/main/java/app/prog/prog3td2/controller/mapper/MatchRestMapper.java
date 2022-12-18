package app.prog.prog3td2.controller.mapper;

import app.prog.prog3td2.controller.response.CreateMatchResponse;
import app.prog.prog3td2.controller.response.MatchResponse;
import app.prog.prog3td2.controller.response.TeamResponse;
import app.prog.prog3td2.controller.response.UpdateMatchResponse;
import app.prog.prog3td2.model.MatchEntity;
import app.prog.prog3td2.model.TeamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private final TeamRestMapper teamRestMapper;
    public MatchResponse toRest(MatchEntity domain){
        TeamResponse homeTeam = teamRestMapper.toRest(domain.getHomeTeam());
        TeamResponse awayTeam = teamRestMapper.toRest(domain.getAwayTeam());
        return MatchResponse.builder()
                .id(domain.getId())
                .homeTeam(homeTeam)
                .awayTeam(awayTeam)
                .datetime(domain.getDatetime())
                .build();
    }

    public MatchEntity toDomain(CreateMatchResponse rest){
        TeamEntity domainHomeTeam = teamRestMapper.toDomain(rest.getHomeTeam());
        TeamEntity domainAwayTeam = teamRestMapper.toDomain(rest.getAwayTeam());
        return MatchEntity.builder()
                .homeTeam(domainHomeTeam)
                .awayTeam(domainAwayTeam)
                .datetime(rest.getDatetime())
                .build();
    }

    public MatchEntity toDomain(UpdateMatchResponse rest){
        TeamEntity domainHomeTeam = teamRestMapper.toDomain(rest.getHomeTeam());
        TeamEntity domainAwayTeam = teamRestMapper.toDomain(rest.getAwayTeam());
        return MatchEntity.builder()
                .homeTeam(domainHomeTeam)
                .awayTeam(domainAwayTeam)
                .datetime(rest.getDatetime())
                .build();
    }
}
