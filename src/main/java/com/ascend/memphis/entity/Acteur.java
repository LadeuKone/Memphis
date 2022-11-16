package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "ACTEUR_PROJET", indexes = {
        @Index(name = "IDX_ACTEUR_PROJET_UNQ", columnList = "NAME", unique = true)
})
@Entity
public class Acteur {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "NAME", nullable = false, length = 80)
    @NotNull
    private String name;

    @Column(name = "REPRESENTANT", length = 100)
    private String representant;

    @Column(name = "FONCTION_REPRESENTANT", length = 60)
    private String fonctionRepresentant;

    @Column(name = "ADRESSE", nullable = false)
    @NotNull
    private String adresse;

    @Column(name = "TELEPHONE")
    private String telephone;

    @Email
    @Column(name = "EMAIL")
    private String email;

    @Column(name = "LOCALISATION")
    private String localisation;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    @Composition
    @OneToMany(mappedBy = "acteur")
    private List<ActeurProjet> projets;

    public List<ActeurProjet> getProjets() {
        return projets;
    }

    public void setProjets(List<ActeurProjet> projets) {
        this.projets = projets;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getFonctionRepresentant() {
        return fonctionRepresentant;
    }

    public void setFonctionRepresentant(String fonctionRepresentant) {
        this.fonctionRepresentant = fonctionRepresentant;
    }

    public String getRepresentant() {
        return representant;
    }

    public void setRepresentant(String representant) {
        this.representant = representant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @InstanceName
    @DependsOnProperties({"name"})
    public String getDisplayName() {
        return String.format("%s", name);
    }
}