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
@Table(name = "LOCALITE", indexes = {
        @Index(name = "IDX_LOCALITE_DEPARTEMENT", columnList = "DEPARTEMENT_ID"),
        @Index(name = "IDX_LOCALITE_UNQ", columnList = "NAME", unique = true)
})
@Entity
public class Localite {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotBlank
    @NotEmpty
    @InstanceName
    @Column(name = "NAME", nullable = false, length = 100)
    @NotNull
    private String name;

    @JoinColumn(name = "DEPARTEMENT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Departement departement;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
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