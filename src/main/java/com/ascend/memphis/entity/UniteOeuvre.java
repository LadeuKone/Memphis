package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@JmixEntity
@Table(name = "UNITE_OEUVRE", indexes = {
        @Index(name = "IDX_UNITE_OEUVRE_UNQ", columnList = "CODE", unique = true),
        @Index(name = "IDX_UNITE_OEUVRE_UNQ_1", columnList = "NAME", unique = true)
})
@Entity
public class UniteOeuvre {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CODE", nullable = false, length = 10)
    @NotNull
    private String code;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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