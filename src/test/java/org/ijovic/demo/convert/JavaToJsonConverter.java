package org.ijovic.demo.convert;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.ijovic.demo.orientdb.entities.PersonEntity;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by ivanj on 15.06.2017.
 */
public class JavaToJsonConverter {

    @Test
    public void convertToJsonString() throws JsonProcessingException {
        PersonEntity pe = new PersonEntity("Ivan", "Jovic", 27);

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(pe);
        assertNotNull(s);
        System.out.print(s);
    }
}
