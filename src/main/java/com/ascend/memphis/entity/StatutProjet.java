package com.ascend.memphis.entity;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum StatutProjet implements EnumClass<Integer> {

    STATUT_INI(10),
    STATUT_APS(20),
    STATUT_APD(30),
    STATUT_AO(40),
    STATUT_EN_COURS(50),
    STATUT_FIN(60);

    private Integer id;

    StatutProjet(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static StatutProjet fromId(Integer id) {
        for (StatutProjet at : StatutProjet.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}