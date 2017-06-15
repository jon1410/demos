package org.ijovic.demo.orientdb.app.config;

import org.ijovic.demo.orientdb.entities.PersonEntity;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.orient.commons.core.OrientTransactionManager;
import org.springframework.data.orient.object.OrientObjectDatabaseFactory;
import org.springframework.data.orient.object.OrientObjectTemplate;

import javax.annotation.PostConstruct;

/**
 * Created by ivanj on 15.06.2017.
 */
@Configuration
public class OrientDBFConfiguration {

    @Bean
    public OrientObjectDatabaseFactory createObjectDBFactory(){

        OrientObjectDatabaseFactory objFactory = new OrientObjectDatabaseFactory();

        objFactory.setUrl("memory:objData");
        objFactory.setUsername("admin");
        objFactory.setPassword("admin");
        return objFactory;
    }

    @Bean
    public OrientTransactionManager transactionManager(){
        return new OrientTransactionManager(createObjectDBFactory());
    }

    @Bean
    public OrientObjectTemplate objectTemplate(){
        return new OrientObjectTemplate(createObjectDBFactory());
    }

    @PostConstruct
    public void registerEntities(){
        createObjectDBFactory().db().getEntityManager().registerEntityClass(PersonEntity.class);
    }
}
