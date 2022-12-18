package app.prog.prog3td2.repository;

import app.prog.prog3td2.model.SponsorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SponsorRepository extends JpaRepository<SponsorEntity, Integer> {
    SponsorEntity findByIdAndName(Integer id, String name);
}
