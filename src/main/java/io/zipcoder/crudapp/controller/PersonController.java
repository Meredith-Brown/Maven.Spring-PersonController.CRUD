package io.zipcoder.crudapp.controller;

import io.zipcoder.crudapp.model.Person;
import io.zipcoder.crudapp.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {
    @Autowired
    PersonService personService = PersonService.shared();
    List<Person> personList = new ArrayList<>();

    private static PersonController personController = new PersonController();

    private PersonController() {}

    public static PersonController shared() { // Singleton --- getInstance
        return personController;
    }

    public Person createPerson(Person p) {
        return null;
    // create methods manually
        // controller says this takes get, post put
        // controller tells the service what to do
        // and the service calls the repsotiry


        // controller, service, resposity --- controller cals service, service calls repositiry
        //controller has endpoint, request types, response types
        // heavy lifting happens in service
        // autowire service to controller
        // CONTROLLER - getmapping, postmapping, etc.
    }

    public Person getPerson(long ID) {
        return null;
    }

    public List<Person> getPersonList() {
        return null;
    }

    public Person updatePerson(Person p) {
        return null;
    }

    public void deletePerson (long ID) {

    }

}