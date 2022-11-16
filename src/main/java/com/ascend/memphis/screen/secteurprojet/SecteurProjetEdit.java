package com.ascend.memphis.screen.secteurprojet;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.SecteurProjet;

@UiController("SecteurProjet.edit")
@UiDescriptor("secteur-projet-edit.xml")
@EditedEntityContainer("secteurProjetDc")
public class SecteurProjetEdit extends StandardEditor<SecteurProjet> {
}