package app.prog.prog3td2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;

@Component
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMatchResponse {
    private int id;
    private UpdateTeamResponse homeTeam;
    private UpdateTeamResponse awayTeam;
    private Instant datetime;
}
