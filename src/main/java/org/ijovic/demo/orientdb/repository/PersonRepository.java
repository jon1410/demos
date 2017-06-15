package org.ijovic.demo.orientdb.repository;

import org.ijovic.demo.orientdb.entities.PersonEntity;
import org.springframework.data.orient.commons.repository.annotation.Query;
import org.springframework.data.orient.object.repository.OrientObjectRepository;

import java.util.List;

/**
 * Created by ivanj on 15.06.2017.
 */
public interface PersonRepository extends OrientObjectRepository<PersonEntity> {

    List<PersonEntity> findAllByAge(Integer age);

    List<PersonEntity> findAllByLastName(String lastName);

    List<PersonEntity> findAllByFirstName(String firstName);

    @Query("select from person where firstName = ? and lastName = ?")
    List<PersonEntity> findPersonByFullName(String firstName, String lastName);
}
