//import addressBookPackage.AddressBook;
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
//import javax.swing.*;
//
//public class AddressBookTest {
//
//
//    @Test
//    public void persistenceTest() {
//        AddressBook addressBook;
//        BuddyInfo buddy1, buddy2 ;
//        EntityManagerFactory emf;
//        EntityManager em;
//        EntityTransaction tx;
//
//
//        //creating objects representing some buddyinfos/addressBook
//        addressBook = new AddressBook();
//        addressBook.setBuddies(new DefaultListModel<>());
//        buddy1 = new BuddyInfo();
//        buddy1.setId(1);
//        buddy1.setName("Tasha");
//        buddy1.setAddress("Ottawa");
//        buddy1.setPhoneNumber("613");
//
//        buddy2 = new BuddyInfo();
//        buddy2.setId(2);
//        buddy2.setName("Will");
//        buddy2.setAddress("Ottawa");
//        buddy2.setPhoneNumber("613");
//
//
//        emf = Persistence.createEntityManagerFactory("jpa-test");
//        em = emf.createEntityManager();
//
//        //Create a new transaction
//        tx = em.getTransaction();
//        tx.begin();
//
//        //persisting the buddy entity objects
//        em.persist(buddy1);
//        em.persist(buddy2);
//        addressBook.addBuddy(buddy1);
//        addressBook.addBuddy(buddy2);
//        em.persist(addressBook);
//        tx.commit();
//
//        //Querying the contents of the database using JPQL Query
//        Query s = em.createQuery("SELECT s FROM addresBookPackage.AddressBook s");
//
//
//
//        @SuppressWarnings("unchecked")
//        List<AddressBook> result = s.getResultList();
//
//
//
//       System.out.println("List of addressBooks\n------------------");
//
//        for (AddressBook a : result) {
//            System.out.println("  Address Book (id=" + a.getId() + ")");
//            for(int i = 0; i < a.getBuddies().getSize(); i++)
////            for (addresBookPackage.BuddyInfo b : a.getBuddies()) {
////                System.out.println("   == " + " (id=" + b.getId() + ") " + b.getName() + " " + b.getPhoneNumber());
////            }
//                System.out.println("   == " + " (id=" + a.getBuddies().get(i).getId() + ") " + a.getBuddies().get(i).getName() + " " + a.getBuddies().get(i).getPhoneNumber() );
//                   }
//
//        //closing connection
//        em.close();
//        emf.close();
//    }
//}
