package io.datajek.databaserelationships.manytomany.repository;

import io.datajek.databaserelationships.manytomany.Tournament;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TournamentRepository extends JpaRepository<Tournament, Integer> {

}
