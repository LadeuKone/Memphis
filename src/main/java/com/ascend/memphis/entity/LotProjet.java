package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "LOT_PROJET", indexes = {
        @Index(name = "IDX_LOTPROJET_TYPEREALISATION", columnList = "TYPE_REALISATION_ID"),
        @Index(name = "IDX_LOT_PROJET_UNQ", columnList = "NUM_LOT", unique = true),
        @Index(name = "IDX_LOT_PROJET_UNQ_1", columnList = "NAME", unique = true),
        @Index(name = "IDX_LOT_PROJET_PROJET", columnList = "PROJET_ID")
})
@Entity
public class LotProjet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "NUM_LOT", nullable = false)
    @NotNull
    private Integer numLot;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @JoinColumn(name = "TYPE_REALISATION_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private TypeRealisation typeRealisation;

    @JoinColumn(name = "PROJET_ID", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Projet projet;

    @Column(name = "VALEUR_ESTIMEE", precision = 19, scale = 0)
    private BigDecimal valeurEstimee;

    @Composition
    @OneToMany(mappedBy = "lot")
    private List<DetailLot> detailLot;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public List<DetailLot> getDetailLot() {
        return detailLot;
    }

    public void setDetailLot(List<DetailLot> detailLot) {
        this.detailLot = detailLot;
    }

    public void setValeurEstimee(BigDecimal valeurEstimee) {
        this.valeurEstimee = valeurEstimee;
    }

    public BigDecimal getValeurEstimee() {
        return valeurEstimee;
    }

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public TypeRealisation getTypeRealisation() {
        return typeRealisation;
    }

    public void setTypeRealisation(TypeRealisation typeRealisation) {
        this.typeRealisation = typeRealisation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumLot() {
        return numLot;
    }

    public void setNumLot(Integer numLot) {
        this.numLot = numLot;
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
    @DependsOnProperties({"numLot"})
    public String getDisplayName() {
        return String.format("%s", numLot);
    }
}