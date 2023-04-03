package io.datajek.databaserelationships.manytomany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") //2nd solution to JSON Infinite Recursion
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String name;
    @OneToMany(mappedBy = "player", cascade = CascadeType.ALL)
    private List<Registration> registrations = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, optional = false) // optional = false) TELLS that association cannot be null, by default it is true which means it can be null.
    @JoinColumn(name = "profile_id", referencedColumnName = "id")
//    @JsonManagedReference //1st solution to JSON Infinite Recursion
    private PlayerProfile playerProfile;

    public PlayerProfile getPlayerProfile() {
        return playerProfile;
    }

    public void setPlayerProfile(PlayerProfile playerProfile) {
        this.playerProfile = playerProfile;
    }

    public Player() {
    }

    public Player(int id, String name) {
        Id = id;
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(List<Registration> registrations) {
        this.registrations = registrations;
    }

    //set up bidirectional relationship with Registration class
    public void registerPlayer(Registration reg) {
        //add registration to the list
        registrations.add(reg);
        //set the player field in the registration
        reg.setPlayer(this);
    }

    @Override
    public String toString() {
        return "Player{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", playerProfile=" + playerProfile +
                '}';
    }
}
