package com.ascend.memphis.entity;

import io.jmix.core.DeletePolicy;
import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.entity.annotation.OnDeleteInverse;
import io.jmix.core.metamodel.annotation.Composition;
import io.jmix.core.metamodel.annotation.DependsOnProperties;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@JmixEntity
@Table(name = "PROJET", indexes = {
        @Index(name = "IDX_PROJET_SECTEUR_PROJET", columnList = "SECTEUR_PROJET_ID"),
        @Index(name = "IDX_PROJET_PROGRAMME", columnList = "PROGRAMME_ID")
})
@Entity
public class Projet {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "PROGRAMME_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Programme programme;

    @OnDeleteInverse(DeletePolicy.DENY)
    @JoinColumn(name = "SECTEUR_PROJET_ID", nullable = false)
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private SecteurProjet secteurProjet;

    @Column(name = "COMMENTAIRE", length = 300)
    private String commentaire;

    @Column(name = "DATE_PREVISIONNELLE_APS")
    private LocalDate datePrevisionnelleAPS;

    @Column(name = "DATE_PREVISIONNELLE_APD")
    private LocalDate datePrevisionnelleAPD;

    @Column(name = "DATE_PREVISIONNELLE_AO")
    private LocalDate datePrevisionnelleAO;

    @Column(name = "DATE_PREVISIONNELLE_DEMARRAGE")
    private LocalDate datePrevisionnelleDemarrage;

    @Column(name = "DATE_PREVISIONNELLE_FIN")
    private LocalDate datePrevisionnelleFin;

    @Column(name = "DATE_APS")
    private LocalDate dateAPS;

    @Column(name = "FICHIER_APS", length = 1024)
    private FileRef fichierAPS;

    @Column(name = "DATE_APD")
    private LocalDate dateAPD;

    @Column(name = "FICHIER_APD", length = 1024)
    private FileRef fichierAPD;

    @Composition
    @OneToMany(mappedBy = "projet")
    private List<ActeurProjet> acteurs;

    @Composition
    @OneToMany(mappedBy = "projet")
    private List<LotProjet> lots;

    @Column(name = "MONTANT_ESTIME", precision = 19, scale = 0)
    private BigDecimal montantEstime;

    @Column(name = "STATUT_PROJET", nullable = false)
    @NotNull
    private Integer statutProjet;

    @Column(name = "VERSION", nullable = false)
    @Version
    private Integer version;

    public void setStatutProjet(StatutProjet statutProjet) {
        this.statutProjet = statutProjet == null ? null : statutProjet.getId();
    }

    public StatutProjet getStatutProjet() {
        return statutProjet == null ? null : StatutProjet.fromId(statutProjet);
    }

    public FileRef getFichierAPD() {
        return fichierAPD;
    }

    public void setFichierAPD(FileRef fichierAPD) {
        this.fichierAPD = fichierAPD;
    }

    public LocalDate getDateAPD() {
        return dateAPD;
    }

    public void setDateAPD(LocalDate dateAPD) {
        this.dateAPD = dateAPD;
    }

    public List<ActeurProjet> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<ActeurProjet> acteurs) {
        this.acteurs = acteurs;
    }

    public BigDecimal getMontantEstime() {
        return montantEstime;
    }

    public void setMontantEstime(BigDecimal montantEstime) {
        this.montantEstime = montantEstime;
    }

    public List<LotProjet> getLots() {
        return lots;
    }

    public void setLots(List<LotProjet> lots) {
        this.lots = lots;
    }

    public FileRef getFichierAPS() {
        return fichierAPS;
    }

    public void setFichierAPS(FileRef fichierAPS) {
        this.fichierAPS = fichierAPS;
    }

    public LocalDate getDateAPS() {
        return dateAPS;
    }

    public void setDateAPS(LocalDate dateAPS) {
        this.dateAPS = dateAPS;
    }

    public LocalDate getDatePrevisionnelleFin() {
        return datePrevisionnelleFin;
    }

    public void setDatePrevisionnelleFin(LocalDate datePrevisionnelleFin) {
        this.datePrevisionnelleFin = datePrevisionnelleFin;
    }

    public LocalDate getDatePrevisionnelleDemarrage() {
        return datePrevisionnelleDemarrage;
    }

    public void setDatePrevisionnelleDemarrage(LocalDate datePrevisionnelleDemarrage) {
        this.datePrevisionnelleDemarrage = datePrevisionnelleDemarrage;
    }

    public LocalDate getDatePrevisionnelleAO() {
        return datePrevisionnelleAO;
    }

    public void setDatePrevisionnelleAO(LocalDate datePrevisionnelleAO) {
        this.datePrevisionnelleAO = datePrevisionnelleAO;
    }

    public LocalDate getDatePrevisionnelleAPD() {
        return datePrevisionnelleAPD;
    }

    public void setDatePrevisionnelleAPD(LocalDate datePrevisionnelleAPD) {
        this.datePrevisionnelleAPD = datePrevisionnelleAPD;
    }

    public LocalDate getDatePrevisionnelleAPS() {
        return datePrevisionnelleAPS;
    }

    public void setDatePrevisionnelleAPS(LocalDate datePrevisionnelleAPS) {
        this.datePrevisionnelleAPS = datePrevisionnelleAPS;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

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

    @InstanceName
    @DependsOnProperties({"name"})
    public String getDisplayName() {
        return String.format("%s", name);
    }
}