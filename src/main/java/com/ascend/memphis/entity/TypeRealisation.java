package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "TYPE_REALISATION", indexes = {
        @Index(name = "IDX_TYPEREALISAT_SECTEURPROJE", columnList = "SECTEUR_PROJET_ID"),
        @Index(name = "IDX_TYPE_REALISATION_UNQ", columnList = "NAME, SECTEUR_PROJET_ID", unique = true)
})
@Entity
public class TypeRealisation {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotBlank(message = "{msg://com.ascend.memphis.entity/TypeRealisation.name.validation.NotBlank}")
    @NotEmpty(message = "{msg://com.ascend.memphis.entity/TypeRealisation.name.validation.NotEmpty}")
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @JoinColumn(name = "SECTEUR_PROJET_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SecteurProjet secteurProjet;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public SecteurProjet getSecteurProjet() {
        return secteurProjet;
    }

    public void setSecteurProjet(SecteurProjet secteurProjet) {
        this.secteurProjet = secteurProjet;
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