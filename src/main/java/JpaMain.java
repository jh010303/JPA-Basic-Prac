import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jpabook.jpashop.domain.Book;

public class JpaMain {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();
        //code
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            //저장
            Book book  = new Book();
            book.setName("JPA Book");
            book.setAuthor("JPA Author");
            em.persist(book);

            tx.commit();
        }catch(Exception e) {
            System.out.println(e.getMessage());
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
