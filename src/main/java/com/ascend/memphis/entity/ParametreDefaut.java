package com.ascend.memphis.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@JmixEntity
@Table(name = "PARAMETRE_DEFAUT", indexes = {
        @Index(name = "IDX_PARAMETRE_DEFAUT_UNQ", columnList = "DATE_PARAMETRE", unique = true)
})
@Entity
public class ParametreDefaut {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "DATE_PARAMETRE", nullable = false)
    @NotNull
    private LocalDate dateParametre;

    @Column(name = "CODE_ENTREPRISE", nullable = false, length = 30)
    @NotNull
    private String codeEntreprise;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "NOM_SIGNATAIRE", nullable = false, length = 80)
    @NotNull
    private String nomSignataire;

    @Column(name = "PRENOMS_SIGNATAIRE", nullable = false)
    @NotNull
    private String prenomsSignataire;

    @Column(name = "IS_DECOMPTE_DETAIL", nullable = false)
    @NotNull
    private Boolean isDecompteDetail = false;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public LocalDate getDateParametre() {
        return dateParametre;
    }

    public void setDateParametre(LocalDate dateParametre) {
        this.dateParametre = dateParametre;
    }

    public Boolean getIsDecompteDetail() {
        return isDecompteDetail;
    }

    public void setIsDecompteDetail(Boolean isDecompteDetail) {
        this.isDecompteDetail = isDecompteDetail;
    }

    public String getPrenomsSignataire() {
        return prenomsSignataire;
    }

    public void setPrenomsSignataire(String prenomsSignataire) {
        this.prenomsSignataire = prenomsSignataire;
    }

    public String getNomSignataire() {
        return nomSignataire;
    }

    public void setNomSignataire(String nomSignataire) {
        this.nomSignataire = nomSignataire;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeEntreprise() {
        return codeEntreprise;
    }

    public void setCodeEntreprise(String codeEntreprise) {
        this.codeEntreprise = codeEntreprise;
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