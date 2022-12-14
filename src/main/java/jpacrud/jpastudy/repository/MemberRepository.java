package jpacrud.jpastudy.repository;

import jpacrud.jpastudy.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
