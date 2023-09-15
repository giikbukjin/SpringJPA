package hellojpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf // Factory 코드는 한 번만
                = Persistence.createEntityManagerFactory("hello"); //생성
        EntityManager em = emf.createEntityManager();
        // EntityManager는 클라이언트 상호 작용 시마다 생성

        EntityTransaction tx = em.getTransaction();
        tx.begin(); // 데이터 변경하는 모든 작업은 Transaction 안에서

        Member member = new Member();
        member.setId(1L);
        member.setName("HelloA"); // 기본값 설정

        em.persist(member); // JPA에 데이터 저장

        tx.commit();

        em.close();
        emf.close();
    }
}
