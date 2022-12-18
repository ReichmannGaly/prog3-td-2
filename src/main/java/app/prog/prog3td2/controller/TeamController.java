package app.prog.prog3td2.controller;

import app.prog.prog3td2.controller.mapper.TeamRestMapper;
import app.prog.prog3td2.controller.response.CreateTeamResponse;
import app.prog.prog3td2.controller.response.TeamResponse;
import app.prog.prog3td2.controller.response.UpdateTeamResponse;
import app.prog.prog3td2.model.TeamEntity;
import app.prog.prog3td2.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private final TeamService service;
    private final TeamRestMapper teamRestMapper;

    @GetMapping("/teams")
    public List<TeamResponse> getTeams(){
        return service.getTeams()
                .stream()
                .map(teamRestMapper::toRest)
                .toList();
    }

    @PostMapping("/teams")
    public List<TeamResponse> createTeams(@RequestBody List<CreateTeamResponse> toCreate){
        List<TeamEntity> domain = toCreate
                .stream()
                .map(teamRestMapper::toDomain).toList();
        return service.createTeams(domain)
                .stream()
                .map(teamRestMapper::toRest)
                .toList();
    }

    @PutMapping("/teams")
    public List<TeamResponse> updateTeams(@RequestBody List<UpdateTeamResponse> toUpdate){
        List<TeamEntity> domain = toUpdate
                .stream()
                .map(teamRestMapper::toDomain).toList();
        return service.updateTeams(domain)
                .stream()
                .map(teamRestMapper::toRest)
                .toList();
    }
}
