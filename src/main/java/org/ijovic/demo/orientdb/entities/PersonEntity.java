package org.ijovic.demo.orientdb.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

/**
 * Created by ivanj on 15.06.2017.
 */
@JsonIgnoreProperties(value = "handler")
@Entity
public class PersonEntity {

    @Id
    private Long id;

    @Version
    @JsonIgnore
    private Long version;

    /**
     * Added to avoid a runtime error whereby the detachAll property is checked
     * for existence but not actually used.
     */
    private String detachAll;
    private String firstName;
    private String lastName;
    private Integer age;

    public PersonEntity() {
    }

    public PersonEntity(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDetachAll() {
        return detachAll;
    }

    public void setDetachAll(String detachAll) {
        this.detachAll = detachAll;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
