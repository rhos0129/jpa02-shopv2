package com.example.jpashopv2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @PersistenceContext // 스프링부트가 알아서 주입해준다.
    private EntityManager em;

    public Long save(Member member){
        em.persist(member);
        return member.getId(); // 커맨드와 쿼리 분리를 위해 pk 외의 리턴값을 거의 만들지 않는다.
    }

    public Member find(Long id){
        return em.find(Member.class, id);
    }
}
