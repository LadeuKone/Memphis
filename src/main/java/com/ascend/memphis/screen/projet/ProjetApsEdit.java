package com.ascend.memphis.screen.projet;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Projet;

@UiController("Projet_aps.edit")
@UiDescriptor("projet_aps-edit.xml")
@EditedEntityContainer("projetDc")
public class ProjetApsEdit extends StandardEditor<Projet> {
}