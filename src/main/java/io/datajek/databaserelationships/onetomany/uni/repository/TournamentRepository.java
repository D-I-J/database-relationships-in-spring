package io.datajek.databaserelationships.onetomany.uni.repository;

import io.datajek.databaserelationships.onetomany.uni.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Integer> {

}
