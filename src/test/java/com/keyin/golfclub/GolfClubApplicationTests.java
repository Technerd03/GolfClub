package src.test.java.com.keyin.golfclub;

import com.keyin.golfclub.entity.Member;
import com.keyin.golfclub.entity.Tournament;
import com.keyin.golfclub.repository.MemberRepository;
import com.keyin.golfclub.repository.TournamentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

@SpringBootTest
public class GolfClubApplicationTests {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private TournamentRepository tournamentRepository;

    @Test
    public void testAddMember() {
        Member member = new Member();
        member.setName("Jane Doe");
        member.setAddress("456 Golf Drive");
        member.setEmail("jane@example.com");
        member.setPhoneNumber("555-6789");
        member.setStartDateOfMembership(LocalDate.of(2024, 1, 1));
        member.setDurationOfMembership(12);

        Member savedMember = memberRepository.save(member);

        assertThat(savedMember).isNotNull();
        assertThat(savedMember.getId()).isNotNull();
    }

    @Test
    public void testAddTournament() {
        Tournament tournament = new Tournament();
        tournament.setStartDate(LocalDate.of(2024, 3, 15));
        tournament.setEndDate(LocalDate.of(2024, 3, 20));
        tournament.setLocation("Sunny Golf Resort");
        tournament.setEntryFee(150.0);
        tournament.setCashPrize(10000.0);

        Tournament savedTournament = tournamentRepository.save(tournament);

        assertThat(savedTournament).isNotNull();
        assertThat(savedTournament.getId()).isNotNull();
    }

    @Test
    public void testFindMemberById() {
        Optional<Member> member = memberRepository.findById(1L);

        assertThat(member).isPresent();
        assertThat(member.get().getName()).isNotBlank();
    }
}
