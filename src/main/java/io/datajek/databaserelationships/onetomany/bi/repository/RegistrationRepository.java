package io.datajek.databaserelationships.onetomany.bi.repository;

import io.datajek.databaserelationships.onetomany.bi.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {

}
