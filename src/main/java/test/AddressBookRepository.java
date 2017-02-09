package test;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by praveenensrikumaran on 1/26/2017.
 */
public interface AddressBookRepository extends CrudRepository<AddressBook, Integer> {

    List<AddressBook> findById(Integer id);
}
