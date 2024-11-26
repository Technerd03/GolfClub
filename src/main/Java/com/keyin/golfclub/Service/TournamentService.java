package src.main.Java.Com.keyin.golfclub.Service;

import com.keyin.golfclub.entity.Tournament;
import com.keyin.golfclub.repository.TournamentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TournamentService {
    private final TournamentRepository repository;

    public TournamentService(TournamentRepository repository) {
        this.repository = repository;
    }

    public Tournament addTournament(Tournament tournament) {
        return repository.save(tournament);
    }

    public List<Tournament> getAllTournaments() {
        return repository.findAll();
    }
}
