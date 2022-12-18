package app.prog.prog3td2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "match")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MatchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "home_team_id")
    private TeamEntity homeTeam;

    @ManyToOne
    @JoinColumn(name = "away_team_id")
    private TeamEntity awayTeam;

    private Instant datetime;

    private String stadium;
}
