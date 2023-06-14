package com.exLab.SpringDemoFromAnnaBot.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(schema = "telegrambot", name="city")
public class City {
    @Id
    @Column(name = "uuid")
    private UUID uuid;
    @Column(name="name")
    private String name;
    @Column(name="info")
    private String info;

    public City() {
    }

    public City(UUID uuid, String name, String info) {
        this.uuid = uuid;
        this.name = name;
        this.info = info;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
