
public class Main {
    public static void main(String[] args) {
    }

}
        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PDAcademy");
        System.out.println("entityManager open "+entityManagerFactory.isOpen());
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Admins admins = new Admins();
        admins.setFirst_name("Oussama");
        admins.setLast_name("Souayri");
        admins.setEmail("souayrioss@gmail.com");
        admins.setPassword("azerty");
        admins.setLogin("zoro");
        admins.setPhone("052442562");
        admins.setRole(Roles.ADMIN);
        Genres homme = Genres.Homme;
        admins.setGenre(homme);
        admins.setEtat_id(Etats.ACTIVE);
        entityManager.persist(admins);
        System.out.println("name "+entityManager.find(Users.class,1).getFirst_name());
        System.out.println("done");
        entityManager.getTransaction().commit();
        entityManager.getTransaction().begin();
        entityManager.createQuery("select user from Users user", Users.class).getResultList().stream().map(u->u.getPhone()).forEach(System.out::println);
        entityManager.getTransaction().commit();
        */
