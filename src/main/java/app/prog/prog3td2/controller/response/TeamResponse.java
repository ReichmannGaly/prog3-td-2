package app.prog.prog3td2.controller.response;

import app.prog.prog3td2.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class TeamResponse {
    private int id;
    private String name;
    private List<PlayerResponse> players;
    private List<SponsorEntity> sponsors;
}
