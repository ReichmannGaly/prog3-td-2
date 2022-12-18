package app.prog.prog3td2.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchResponse {
    private int id;
    private TeamResponse homeTeam;
    private TeamResponse awayTeam;
    private LocalDate datetime;
    private String stadium;
}
