import com.pda.pdacademy.beans.Participants;
import com.pda.pdacademy.beans.Responsables;
import com.pda.pdacademy.beans.Users;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PDAcademy");
        System.out.println("entityManager open "+entityManagerFactory.isOpen());
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Participants p=new Participants();
        p.setFirst_name("oussama");
        p.setLast_name("souayri");
        p.setEmail("ousou@gmail.com");
        p.setPhone("053643664");
        p.setDomain("aaaaaaaaaaaaaaa");
        p.setStructure("ertyui");
        entityManager.persist(p);
        Responsables s2=new Responsables();
        s2.setFirst_name("jamal");
        s2.setLast_name("java");
        entityManager.persist(s2);
        System.out.println("name "+entityManager.find(Users.class,1).getFirst_name());
        System.out.println("done");
        entityManager.getTransaction().commit();
        entityManager.getTransaction().begin();
        entityManager.createQuery("select user from Users user", Users.class).getResultList().stream().map(u->u.getFirst_name()).forEach(System.out::println);
        entityManager.getTransaction().commit();


//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("digital_academy");
//        System.out.println(entityManagerFactory.isOpen());
//        System.exit(0);
//        EntityManager entityManager = entityManagerFactory.createEntityManager();

    }
}