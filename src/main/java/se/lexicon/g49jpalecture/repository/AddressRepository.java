package se.lexicon.g49jpalecture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.lexicon.g49jpalecture.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
