package demo.repository;

import demo.entity.Member;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class MemberRepository {
    @PersistenceContext
    private EntityManager em;

    public void persist(Member member) {
        em.persist(member);
    }

    public List<Member> findAll() {
        return em.createQuery("SELECT m FROM member m", Member.class).getResultList();
    }

}
