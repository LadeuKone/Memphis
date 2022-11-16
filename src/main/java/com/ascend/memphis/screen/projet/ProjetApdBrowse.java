package com.ascend.memphis.screen.projet;

import com.ascend.memphis.entity.StatutProjet;
import io.jmix.core.DataManager;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.GroupTable;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Projet;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Projet_apd.browse")
@UiDescriptor("projet_apd-browse.xml")
@LookupComponent("projetsTable")
public class ProjetApdBrowse extends StandardLookup<Projet> {
    @Autowired
    private CollectionLoader<Projet> projetsDl;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private GroupTable<Projet> projetsTable;

    private void updateProjectState(StatutProjet status) {
        Projet projet = projetsTable.getSingleSelected();
        assert projet != null;
        projet.setStatutProjet(status);
        dataManager.save(projet);
        projetsDl.load();
    }

    @Subscribe("projetsTable.goToAps")
    public void onProjetsTableGoToAps(Action.ActionPerformedEvent event) {
        updateProjectState(StatutProjet.STATUT_APS);
    }

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        projetsDl.setParameter("statutProjet", StatutProjet.STATUT_APD);
        projetsDl.load();
    }

    @Subscribe("projetsTable.goToAO")
    public void onProjetsTableGoToAO(Action.ActionPerformedEvent event) {
        updateProjectState(StatutProjet.STATUT_AO);
    }
}