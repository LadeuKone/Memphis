package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@JmixEntity
@Table(name = "DETAIL_LOT", indexes = {
        @Index(name = "IDX_DETAIL_LOT_UNITE", columnList = "UNITE_ID"),
        @Index(name = "IDX_DETAIL_LOT_LOT", columnList = "LOT_ID")
})
@Entity
public class DetailLot {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @JoinColumn(name = "LOT_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private LotProjet lot;

    @Column(name = "NUM_ORDRE", nullable = false)
    @NotNull
    private Integer numOrdre;

    @Column(name = "CODE_TACHE", nullable = false, length = 15)
    @NotNull
    private String codeTache;

    @Column(name = "LIBELLE", nullable = false)
    @NotNull
    private String libelle;

    @JoinColumn(name = "UNITE_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private UniteOeuvre unite;

    @Column(name = "QUANTITATIF", nullable = false)
    @NotNull
    private Double quantitatif;

    @Column(name = "PRIX_UNITAIRE", precision = 19, scale = 2)
    private BigDecimal prixUnitaire;

    @Column(name = "MONTANT", precision = 19, scale = 2)
    private BigDecimal montant;

    @Column(name = "CODE_PARENT", length = 15)
    private String codeParent;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public String getCodeParent() {
        return codeParent;
    }

    public void setCodeParent(String codeParent) {
        this.codeParent = codeParent;
    }

    public LotProjet getLot() {
        return lot;
    }

    public void setLot(LotProjet lot) {
        this.lot = lot;
    }

    public BigDecimal getPrixUnitaire() {
        return prixUnitaire;
    }

    public void setPrixUnitaire(BigDecimal prixUnitaire) {
        this.prixUnitaire = prixUnitaire;
    }

    public Double getQuantitatif() {
        return quantitatif;
    }

    public void setQuantitatif(Double quantitatif) {
        this.quantitatif = quantitatif;
    }

    public BigDecimal getMontant() {
        montant =prixUnitaire.multiply(new BigDecimal(quantitatif));
        return montant;
    }

    public UniteOeuvre getUnite() {
        return unite;
    }

    public void setUnite(UniteOeuvre unite) {
        this.unite = unite;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCodeTache() {
        return codeTache;
    }

    public void setCodeTache(String codeTache) {
        this.codeTache = codeTache;
    }

    public Integer getNumOrdre() {
        return numOrdre;
    }

    public void setNumOrdre(Integer numOrdre) {
        this.numOrdre = numOrdre;
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