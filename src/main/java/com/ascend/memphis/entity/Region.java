package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "REGION", indexes = {
        @Index(name = "IDX_REGION_UNQ", columnList = "NAME", unique = true)
})
@Entity
public class Region {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotBlank
    @NotEmpty
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Composition
    @OneToMany(mappedBy = "region")
    private List<Departement> departements;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public List<Departement> getDepartements() {
        return departements;
    }

    public void setDepartements(List<Departement> departements) {
        this.departements = departements;
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