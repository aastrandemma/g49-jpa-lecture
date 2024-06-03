package se.lexicon.g49jpalecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.g49jpalecture.entity.Instructor;

public interface InstructorRepository extends JpaRepository<Instructor, Long> {
}
