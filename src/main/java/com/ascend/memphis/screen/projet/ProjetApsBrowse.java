package com.ascend.memphis.screen.projet;

import com.ascend.memphis.entity.StatutProjet;
import io.jmix.core.DataManager;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.GroupTable;
import io.jmix.ui.model.CollectionLoader;
import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Projet;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Projet_aps.browse")
@UiDescriptor("projet_aps-browse.xml")
@LookupComponent("projetsTable")
public class ProjetApsBrowse extends StandardLookup<Projet> {
    @Autowired
    private CollectionLoader<Projet> projetsDl;
    @Autowired
    private GroupTable<Projet> projetsTable;
    @Autowired
    private DataManager dataManager;

    @Subscribe
    public void onBeforeShow(BeforeShowEvent event) {
        projetsDl.setParameter("statutProjet", StatutProjet.STATUT_APS);
        projetsDl.load();
    }

    @Subscribe("projetsTable.goToApd")
    public void onProjetsTableGoToApd(Action.ActionPerformedEvent event) {

        updateProjectState(StatutProjet.STATUT_APD);
    }
    private void updateProjectState(StatutProjet status) {
        Projet projet = projetsTable.getSingleSelected();
        assert projet != null;
        projet.setStatutProjet(status);
        dataManager.save(projet);
        projetsDl.load();
    }

    @Subscribe("projetsTable.goToIni")
    public void onProjetsTableGoToIni(Action.ActionPerformedEvent event) {
        updateProjectState(StatutProjet.STATUT_INI);
    }


}