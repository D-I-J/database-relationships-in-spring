package io.datajek.databaserelationships.manytomany.repository;

import io.datajek.databaserelationships.manytomany.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
//    All the code is there in
}
