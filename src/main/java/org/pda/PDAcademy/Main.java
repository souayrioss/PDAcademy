package org.loukili.javac;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.loukili.javac.entity.*;
import org.loukili.javac.hibernate.HibernateFactory;

public class Main {
  public static void main(String[] args) {
//    EntityManager entityManager = HibernateFactory.getEntityManager();
    Responsible responsable = new Responsible();
    responsable.setFirstName("Abdesalam");
    responsable.setLastName("salim");
    responsable.setResponsibleType(ResponsibleType.TRAINER);
    responsable.setDomain("youcode");
    responsable.setPhoneNumber("0612523455");
    responsable.setRole(Role.RESPONSIBLE);
    Gender homme = Gender.MALE;
    responsable.setGender(homme);
    responsable.setState(State.ACTIVE);

    // second responsible
//    Responsible responsible = new Responsible();
//    responsible.setFirstName("Abdesalam2");
//    responsible.setLastName("salim2");
//    responsible.setResponsibleType(ResponsibleType.TRAINER);
//    responsible.setDomain("youcode2");
//    responsible.setPhoneNumber("061332523455");
//    responsible.setRole(Role.RESPONSIBLE);
//    Gender female = Gender.FEMALE;
//    responsible.setGender(female);
//    responsible.setState(State.ACTIVE);

    // first participant:
    Participant participant1 = new Participant();
    participant1.setFirstName("abdeslam");
    participant1.setLastName("ans");
    participant1.setPhoneNumber("123456789");
    participant1.setRole(Role.PARTICIPANT);
    participant1.setGender(Gender.FEMALE);
    participant1.setEmail("abdesla@gmail.com");
    participant1.setDomain("domain1");
    participant1.setStructure("structure1");



    // second participant:
    Participant participant2 = new Participant();
    participant2.setFirstName("abdeslam");
    participant2.setLastName("imran");
    participant2.setPhoneNumber("12345666789");
    participant2.setRole(Role.PARTICIPANT);
    participant2.setGender(Gender.FEMALE);
    participant2.setEmail("abdesla@gail.com");
    participant2.setDomain("domain2");
    participant2.setStructure("structure2");


    // third participant:
    Participant participant3 = new Participant();
    participant3.setFirstName("hamza");
    participant3.setLastName("hamid");
    participant3.setPhoneNumber("1226789");
    participant3.setRole(Role.PARTICIPANT);
    participant3.setGender(Gender.FEMALE);
    participant3.setEmail("abdesla@fgail.com");
    participant3.setDomain("domain3");
    participant3.setStructure("structure3");

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    // first responsible
//    entityManager.getTransaction().begin();
//    entityManager.persist(responsable);
//    entityManager.getTransaction().commit();
//    entityManager.close();
//    entityManagerFactory.close();

    // second responsible
//    entityManager.getTransaction().begin();
//    entityManager.persist(responsible);
//    entityManager.getTransaction().commit();
//    entityManager.close();
//    entityManagerFactory.close();

//    // second responsible
//    entityManager.getTransaction().begin();
//    entityManager.persist(participant1);
//    entityManager.getTransaction().commit();
//    entityManager.close();
//    entityManagerFactory.close();

//    entityManager.getTransaction().begin();
//    entityManager.persist(participant2);
//    entityManager.getTransaction().commit();
//    entityManager.close();
//    entityManagerFactory.close();
//
//    entityManager.getTransaction().begin();
//    entityManager.persist(participant3);
//    entityManager.getTransaction().commit();
//    entityManager.close();
//    entityManagerFactory.close();
  }
}
