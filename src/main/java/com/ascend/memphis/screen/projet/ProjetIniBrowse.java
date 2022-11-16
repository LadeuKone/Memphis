package com.ascend.memphis.screen.projet;

import com.ascend.memphis.entity.StatutProjet;
import io.jmix.core.DataManager;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.Button;
import io.jmix.ui.component.GroupTable;
import io.jmix.ui.component.Table;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Projet;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Projet_ini.browse")
@UiDescriptor("projet_ini-browse.xml")
@LookupComponent("projetsTable")
public class ProjetIniBrowse extends StandardLookup<Projet> {
    @Autowired
    private CollectionLoader<Projet> projetsDl;

    @Autowired
    private GroupTable<Projet> projetsTable;

    @Autowired
    private DataManager dataManager;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        projetsDl.setParameter("statutProjet", StatutProjet.STATUT_INI);
        projetsDl.load();
    }


    @Subscribe("projetsTable.goToAps")
    public void onProjetsTableGoToAps(Action.ActionPerformedEvent event) {
        Projet projet = projetsTable.getSingleSelected();
        projet.setStatutProjet(StatutProjet.STATUT_APS);
        dataManager.save(projet);
        projetsDl.load();
    }




}