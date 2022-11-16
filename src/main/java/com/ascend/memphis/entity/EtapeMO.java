package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.core.metamodel.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.util.UUID;

@JmixEntity
@Table(name = "ETAPE_MO", indexes = {
        @Index(name = "IDX_ETAPE_MO_DEPEND_DE", columnList = "DEPEND_DE_ID")
})
@Entity
public class EtapeMO {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "CODE", nullable = false, length = 15)
    @NotNull
    private String code;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @JoinColumn(name = "DEPEND_DE_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private EtapeMO dependDe;

    @Column(name = "DOC_PRODUIT")
    private String docProduit;

    @PositiveOrZero
    @NumberFormat(pattern = "# ##0,##", decimalSeparator = ",", groupingSeparator = " ")
    @Column(name = "TAUX_TRAVAUX")
    private Double tauxTravaux;

    @PositiveOrZero
    @NumberFormat(pattern = "# ##0,00", decimalSeparator = ",", groupingSeparator = " ")
    @Column(name = "TAUX_MOD")
    private Double tauxMOD;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public Double getTauxMOD() {
        return tauxMOD;
    }

    public void setTauxMOD(Double tauxMOD) {
        this.tauxMOD = tauxMOD;
    }

    public Double getTauxTravaux() {
        return tauxTravaux;
    }

    public void setTauxTravaux(Double tauxTravaux) {
        this.tauxTravaux = tauxTravaux;
    }

    public String getDocProduit() {
        return docProduit;
    }

    public void setDocProduit(String docProduit) {
        this.docProduit = docProduit;
    }

    public EtapeMO getDependDe() {
        return dependDe;
    }

    public void setDependDe(EtapeMO dependDe) {
        this.dependDe = dependDe;
    }

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
    @DependsOnProperties({"code"})
    public String getDisplayName() {
        return String.format("%s", code);
    }
}