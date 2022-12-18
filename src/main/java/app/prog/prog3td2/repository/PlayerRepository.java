package app.prog.prog3td2.repository;

import app.prog.prog3td2.model.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {
    PlayerEntity findByIdAndName(Integer id, String name);

    List<PlayerEntity> findAllByTeam_IdOrderByNumberAsc(Integer teamId);
}
