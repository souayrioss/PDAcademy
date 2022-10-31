import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory test = Persistence.createEntityManagerFactory("PDAcademy");
    }
}