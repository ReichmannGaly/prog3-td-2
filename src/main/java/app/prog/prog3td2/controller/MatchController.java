package app.prog.prog3td2.controller;

import app.prog.prog3td2.controller.mapper.MatchRestMapper;
import app.prog.prog3td2.controller.response.CreateMatchResponse;
import app.prog.prog3td2.controller.response.MatchResponse;
import app.prog.prog3td2.controller.response.UpdateMatchResponse;
import app.prog.prog3td2.model.MatchEntity;
import app.prog.prog3td2.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private final MatchService matchService;
    private final MatchRestMapper matchRestMapper;

    @GetMapping("/matches")
    public List<MatchResponse> getMatches(){
        return matchService.getMatches()
                .stream()
                .map(matchRestMapper::toRest)
                .toList();
    }

    @PostMapping("/matches")
    public List<MatchResponse> createMatches(
            @RequestBody List<CreateMatchResponse> toCreate){
        List<MatchEntity> domain = toCreate
                .stream()
                .map(matchRestMapper::toDomain)
                .toList();
        return matchService.createMatches(domain)
                .stream()
                .map(matchRestMapper::toRest)
                .toList();
    }

    @PutMapping("/matches")
    public List<MatchResponse> updateMatches(
            @RequestBody List<UpdateMatchResponse> toUpdate){
        List<MatchEntity> domain = toUpdate
                .stream()
                .map(matchRestMapper::toDomain)
                .toList();
        return matchService.updateMatches(domain)
                .stream()
                .map(matchRestMapper::toRest)
                .toList();
    }
}
