package io.datajek.databaserelationships.onetoone.repository;

import io.datajek.databaserelationships.onetoone.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile, Integer> {

    //    All the code is there in

}