package src.main.Java.Com.keyin.golfclub.Service;

import com.keyin.golfclub.entity.Member;
import com.keyin.golfclub.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    private final MemberRepository repository;

    public MemberService(MemberRepository repository) {
        this.repository = repository;
    }

    public Member addMember(Member member) {
        return repository.save(member);
    }

    public List<Member> getAllMembers() {
        return repository.findAll();
    }
}