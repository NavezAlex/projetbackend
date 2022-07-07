package com.example.projetbackend.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Type {

    @Id
    @Column(name = "id_type")
    private int id;

    @Column(name = "name_type")
    private String name;

    @OneToMany(mappedBy = "types")
    private List<Famille> familles;

    public Type() {
    }

    public Type(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public List<Famille> getFamilles() {
        return familles;
    }
    public void setFamilles(List<Famille> familles) {
        this.familles = familles;
    }
}
