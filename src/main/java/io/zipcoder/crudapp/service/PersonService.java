package io.zipcoder.crudapp.service;

import io.zipcoder.crudapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;

    private static PersonService service = new PersonService();

    private PersonService() {}

    public static PersonService shared() { // Singleton --- getInstance
        return service;
    }

}
