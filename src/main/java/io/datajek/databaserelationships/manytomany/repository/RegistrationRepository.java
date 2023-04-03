package io.datajek.databaserelationships.manytomany.repository;

import io.datajek.databaserelationships.manytomany.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
