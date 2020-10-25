package com.example.blackjack.model;

import javax.persistence.*;

@Entity
@Table(name="tbl_players")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="coins")
    private int coins;

    public Player()
    {

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public Player(long id, String name, int coins) {
        this.id = id;
        this.name = name;
        this.coins = coins;
    }
}
