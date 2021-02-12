//import addressBookPackage.BuddyInfo;
//import org.junit.Test;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//public class BuddyInfoTest {
//    BuddyInfo buddy1, buddy2 ;
//    EntityManagerFactory emf;
//    EntityManager em;
//    EntityTransaction tx;
//
//    @Test
//    public void persistenceTest() {
//
//        //creating objects representing some buddyinfos
//         buddy1 = new BuddyInfo();
//        buddy1.setId(1);
//        buddy1.setName("Tasha");
//        buddy1.setAddress("Ottawa");
//        buddy1.setPhoneNumber("613");
//
//         buddy2 = new BuddyInfo();
//        buddy2.setId(2);
//        buddy2.setName("Will");
//        buddy2.setAddress("Ottawa");
//        buddy1.setPhoneNumber("613");
//
//
//         emf = Persistence.createEntityManagerFactory("jpa-test");
//         em = emf.createEntityManager();
//
//        //Create a new transaction
//        tx = em.getTransaction();
//        tx.begin();
//
//        //persisting the buddy entity objects
//        em.persist(buddy1);
//        em.persist(buddy2);
//
//        tx.commit();
//
//        //Querying the contents of the database using JPQL Query
//        Query q = em.createQuery("SELECT b FROM addresBookPackage.BuddyInfo b");
//
//        @SuppressWarnings("unchecked")
//        List<BuddyInfo> results = q.getResultList();
//
//        System.out.println("\\nList  of buddies\n------------------");
//
//        for (BuddyInfo b : results) {
//            System.out.println("name: " + b.getName() + " - Phone number: " + b.getPhoneNumber() + " - Address: " + b.getAddress() + " (id = " + b.getId() + ")");
//        }
//
//        //closing connection
//        em.close();
//        emf.close();
//    }
//}
