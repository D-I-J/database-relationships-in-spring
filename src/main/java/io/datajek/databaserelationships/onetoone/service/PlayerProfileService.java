package io.datajek.databaserelationships.onetoone.service;

import io.datajek.databaserelationships.onetoone.PlayerProfile;
import io.datajek.databaserelationships.onetoone.repository.PlayerProfileRepository;
import io.datajek.databaserelationships.onetoone.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerProfileService {
    @Autowired
    PlayerProfileRepository repo;
    public List<PlayerProfile> allPlayerProfiles(){
        return repo.findAll();
    }

    public PlayerProfile getPlayerProfile(int id){
        return repo.findById(id).get();
    }

    public PlayerProfile addPlayerProfile(PlayerProfile playerProfile){
        playerProfile.setId(0);
        return repo.save(playerProfile);
    }

    public void deletePlayerProfile(int id) {
        PlayerProfile tempPlayerProfile = repo.findById(id).get();
        tempPlayerProfile.getPlayer().setPlayerProfile(null);
        tempPlayerProfile.setPlayer(null);
        repo.save(tempPlayerProfile);
        repo.delete(tempPlayerProfile);
    }
}
