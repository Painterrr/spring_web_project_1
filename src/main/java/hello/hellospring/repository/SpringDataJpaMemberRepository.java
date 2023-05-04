package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    /*
    공통으로 제공할 수 없는 메서드들
    ex) 특정 유저 조회를 name, username, guestname, user 등 개발자가 마음대로 정의할 수 있는 메서드
    이러한 것들은 회사마다 니즈가 달라서 공통 요소를 묶어서 제공할 수 없음.
    JPQL select m from Member m where m.name = ?
    -> 이 문장이 sql로 번역되어 실행됨.
    p.58(file:///C:/Users/tttzk/Desktop/Inflearn/%EC%8A%A4%ED%94%84%EB%A7%81%20%EC%9E%85%EB%AC%B8/%E1%84%89%E1%85%B3%E1%84%91%E1%85%B3%E1%84%85%E1%85%B5%E1%86%BC%20%E1%84%8B%E1%85%B5%E1%86%B8%E1%84%86%E1%85%AE%E1%86%AB%20-%20%E1%84%8F%E1%85%A9%E1%84%83%E1%85%B3%E1%84%85%E1%85%A9%20%E1%84%87%E1%85%A2%E1%84%8B%E1%85%AE%E1%84%82%E1%85%B3%E1%86%AB%20%E1%84%89%E1%85%B3%E1%84%91%E1%85%B3%E1%84%85%E1%85%B5%E1%86%BC%20%E1%84%87%E1%85%AE%E1%84%90%E1%85%B3,%20%E1%84%8B%E1%85%B0%E1%86%B8%20MVC,%20DB%20%E1%84%8C%E1%85%A5%E1%86%B8%E1%84%80%E1%85%B3%E1%86%AB%20%E1%84%80%E1%85%B5%E1%84%89%E1%85%AE%E1%86%AF%20v2022-11-28.pdf)


     */
    @Override
    Optional<Member> findByName(String name);
}
