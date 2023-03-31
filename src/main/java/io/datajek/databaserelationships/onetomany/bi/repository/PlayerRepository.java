package io.datajek.databaserelationships.onetomany.bi.repository;

import io.datajek.databaserelationships.onetomany.bi.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {
//    All the code is there in
}
