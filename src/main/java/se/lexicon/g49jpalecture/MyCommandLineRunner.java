package se.lexicon.g49jpalecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.g49jpalecture.entity.Address;
import se.lexicon.g49jpalecture.entity.Student;
import se.lexicon.g49jpalecture.repository.AddressRepository;
import se.lexicon.g49jpalecture.repository.StudentRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("TestStreet", "TestCity", "1234");
       //Address savedAddress = addressRepository.save(address);
        studentRepository.save(new Student("john","doe","john@gmail.com",address));


    }
}
