package se.lexicon.g49jpalecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import se.lexicon.g49jpalecture.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}
