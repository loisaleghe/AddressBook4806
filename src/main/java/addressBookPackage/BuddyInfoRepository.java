package addressBookPackage;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BuddyInfoRepository extends CrudRepository<BuddyInfo, Long> {
    //Iterable<BuddyInfo> findAll();

    List<BuddyInfo> findByName(String name);
//
//    List<BuddyInfo> findByPhone(String phone);
//
//    List<BuddyInfo> findByAdress(String address);

    BuddyInfo findById(long id);



}
