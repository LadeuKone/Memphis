package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "PROGRAMME", indexes = {
        @Index(name = "IDX_PROGRAMME_UNQ", columnList = "NAME", unique = true)
})
@Entity
public class Programme {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @NotBlank
    @NotEmpty
    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "BUDGET", precision = 19, scale = 0)
    private BigDecimal budget;

    @Column(name = "DATE_DEMARRAGE")
    private LocalDate dateDemarrage;

    @Column(name = "DATE_FIN")
    private LocalDate dateFin;

    @Column(name = "REALISE_EN_COURS", precision = 19, scale = 0)
    private BigDecimal realiseEnCours;

    @Column(name = "TOTAL_REALISE", precision = 19, scale = 0)
    private BigDecimal totalRealise;

    @Column(name = "REALISE_TERMINE", precision = 19, scale = 0)
    private BigDecimal realiseTermine;

    @Column(name = "OBSERVATION")
    private String observation;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public BigDecimal getTotalRealise() {
        return totalRealise;
    }

    public void setTotalRealise(BigDecimal totalRealise) {
        this.totalRealise = totalRealise;
    }

    public BigDecimal getRealiseTermine() {
        return realiseTermine;
    }

    public void setRealiseTermine(BigDecimal realiseTermine) {
        this.realiseTermine = realiseTermine;
    }

    public BigDecimal getRealiseEnCours() {
        return realiseEnCours;
    }

    public void setRealiseEnCours(BigDecimal realiseEnCours) {
        this.realiseEnCours = realiseEnCours;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public LocalDate getDateDemarrage() {
        return dateDemarrage;
    }

    public void setDateDemarrage(LocalDate dateDemarrage) {
        this.dateDemarrage = dateDemarrage;
    }

    public BigDecimal getBudget() {
        return budget;
    }

    public void setBudget(BigDecimal budget) {
        this.budget = budget;
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