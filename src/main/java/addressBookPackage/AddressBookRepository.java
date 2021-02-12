package addressBookPackage;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface AddressBookRepository extends CrudRepository<AddressBook, Long>{

    List<AddressBook> findAll();

    AddressBook findById(long id);


}

