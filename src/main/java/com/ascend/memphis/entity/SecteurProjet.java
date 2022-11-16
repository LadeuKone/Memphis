package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "SECTEUR_PROJET", indexes = {
        @Index(name = "IDX_SECTEUR_PROJET_UNQ", columnList = "NAME", unique = true)
})
@Entity
public class SecteurProjet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Composition
    @OneToMany(mappedBy = "secteurProjet")
    private List<TypeRealisation> typeRealisation;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public List<TypeRealisation> getTypeRealisation() {
        return typeRealisation;
    }

    public void setTypeRealisation(List<TypeRealisation> typeRealisation) {
        this.typeRealisation = typeRealisation;
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
}