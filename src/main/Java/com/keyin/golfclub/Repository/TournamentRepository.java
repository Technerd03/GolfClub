package src.main.Java.Com.keyin.golfclub.Repository;

import com.keyin.golfclub.entity.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Long> {
}