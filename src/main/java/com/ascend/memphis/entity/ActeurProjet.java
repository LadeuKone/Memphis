package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "ACTEUR_PROJET_1", indexes = {
        @Index(name = "IDX_ACTEUR_PROJET_1_PROJET", columnList = "PROJET_ID"),
        @Index(name = "IDX_ACTEUR_PROJET_1_ACTEUR", columnList = "ACTEUR_ID"),
        @Index(name = "IDX_ACTEUR_PROJET_1_ROLE", columnList = "ROLE_ID"),
        @Index(name = "IDX_ACTEUR_PROJET_UNQ", columnList = "PROJET_ID, ACTEUR_ID, ROLE_ID", unique = true)
})
@Entity
public class ActeurProjet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "PROJET_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Projet projet;

    @JoinColumn(name = "ACTEUR_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Acteur acteur;

    @JoinColumn(name = "ROLE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private RoleActeur role;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public RoleActeur getRole() {
        return role;
    }

    public void setRole(RoleActeur role) {
        this.role = role;
    }

    public Acteur getActeur() {
        return acteur;
    }

    public void setActeur(Acteur acteur) {
        this.acteur = acteur;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}