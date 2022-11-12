import com.pda.pdacademy.entity.*;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PDAcademy");
        System.out.println("entityManager open "+entityManagerFactory.isOpen());
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Responsable responsable = new Responsable();
        responsable.setFirst_name("Ahmed ");
        responsable.setLast_name("salim");
        responsable.setResponsapleType(ResponsapleType.FORMATEUR);
        responsable.setDomain("youcode");
        responsable.setPhone("0612523455");
        responsable.setRole(Role.RESPONSABLE);
        Gender homme = Gender.Homme;
        responsable.setGenre(homme);
        responsable.setEtat(Etat.ACTIVE);
        entityManager.persist(responsable);
        System.out.println("name "+entityManager.find(User.class,1).getFirst_name());
        System.out.println("done");
        entityManager.getTransaction().commit();
        entityManager.getTransaction().begin();
        entityManager.createQuery("select user from User user", User.class).getResultList().stream().map(u->u.getFirst_name()).forEach(System.out::println);
        entityManager.getTransaction().commit();

    }

}
        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PDAcademy");
        System.out.println("entityManager open "+entityManagerFactory.isOpen());
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Admins responsable = new Admins();
        responsable.setFirst_name("Oussama");
        responsable.setLast_name("Souayri");
        responsable.setEmail("souayrioss@gmail.com");
        responsable.setPassword("azerty");
        responsable.setLogin("zoro");
        responsable.setPhone("052442562");
        responsable.setRole(Roles.ADMIN);
        Genres homme = Genres.Homme;
        responsable.setGenre(homme);
        responsable.setEtat_id(Etats.ACTIVE);
        entityManager.persist(responsable);
        System.out.println("name "+entityManager.find(Users.class,1).getFirst_name());
        System.out.println("done");
        entityManager.getTransaction().commit();
        entityManager.getTransaction().begin();
        entityManager.createQuery("select user from Users user", Users.class).getResultList().stream().map(u->u.getPhone()).forEach(System.out::println);
        entityManager.getTransaction().commit();

        */