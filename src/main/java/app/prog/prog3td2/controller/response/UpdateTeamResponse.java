package app.prog.prog3td2.controller.response;

import app.prog.prog3td2.model.PlayerEntity;
import app.prog.prog3td2.model.SponsorEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class UpdateTeamResponse {
    private int id;
    private String name;
    private List<SponsorEntity> sponsors;
}
