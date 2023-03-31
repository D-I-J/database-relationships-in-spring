package io.datajek.databaserelationships.onetomany.uni.repository;

import io.datajek.databaserelationships.onetomany.uni.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
