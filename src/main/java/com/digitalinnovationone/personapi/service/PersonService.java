package com.digitalinnovationone.personapi.service;

import com.digitalinnovationone.personapi.dto.MessageResponseDTO;
import com.digitalinnovationone.personapi.entities.Person;
import com.digitalinnovationone.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        person = personRepository.save(person);

        return MessageResponseDTO
                .builder()
                .message("Created Person with ID: " + person.getId())
                .build();
    }
}
