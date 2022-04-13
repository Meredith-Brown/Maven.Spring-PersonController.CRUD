package io.zipcoder.crudapp.model;

import org.springframework.stereotype.Component;

import javax.persistence.Id;

@Component
public class Person {
    private String firstName;
    private String lastName;
    @Id
    private long ID;
}


