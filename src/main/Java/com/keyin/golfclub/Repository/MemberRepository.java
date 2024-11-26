package src.main.Java.com.keyin.golfclub.Repository;

import com.keyin.golfclub.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
