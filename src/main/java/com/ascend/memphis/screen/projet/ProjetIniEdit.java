package com.ascend.memphis.screen.projet;

import com.ascend.memphis.entity.StatutProjet;
import io.jmix.ui.component.ComboBox;
import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Projet;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Projet_ini.edit")
@UiDescriptor("projet_ini-edit.xml")
@EditedEntityContainer("projetDc")
public class ProjetIniEdit extends StandardEditor<Projet> {


    @Subscribe
    public void onInitEntity(InitEntityEvent<Projet> event) {
        Projet projet = event.getEntity();
        projet.setStatutProjet(StatutProjet.STATUT_INI);
    }

}