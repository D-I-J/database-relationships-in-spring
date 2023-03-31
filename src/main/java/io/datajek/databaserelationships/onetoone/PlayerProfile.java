package io.datajek.databaserelationships.onetoone;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") //2nd solution to JSON Infinite Recursion
public class PlayerProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String twitter;
    @OneToOne(mappedBy = "playerProfile", cascade = CascadeType.ALL)
//    @JsonBackReference// 1st solution to JSON Infinite Recursion
    private Player player;

    public PlayerProfile() {
    }
    public PlayerProfile(int id, String twitter) {
        Id = id;
        this.twitter = twitter;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    @Override
    public String toString() {
        return "PlayerProfile{" +
                "Id=" + Id +
                ", twitter='" + twitter + '\'' +
                ", player=" + player +
                '}';
    }
}
