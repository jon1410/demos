package org.ijovic.demo.orientdb.rest.controller;

import org.ijovic.demo.orientdb.entities.PersonEntity;
import org.ijovic.demo.orientdb.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ivanj on 15.06.2017.
 */
@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<PersonEntity> getAllPersons(){
        return personRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public PersonEntity createPerson(@RequestBody PersonEntity personEntity){
        return personRepository.save(personEntity);
    }

    @RequestMapping("/isAlive")
    public String isAlive(){
        return "OK";
    }

    @RequestMapping("/lastName")
    public List<PersonEntity> findByLastName(@RequestParam("lastName") String lastName){
        return personRepository.findAllByLastName(lastName);
    }

    @RequestMapping("/firstName")
    public List<PersonEntity> findByFirstName(@RequestParam("firstName") String firstName){
        return personRepository.findAllByFirstName(firstName);
    }

    @RequestMapping("/age")
    public List<PersonEntity> findByAge(@RequestParam("age") Integer age){
        return personRepository.findAllByAge(age);
    }

}
