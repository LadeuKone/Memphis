package com.ascend.memphis.screen.acteurprojet;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.ActeurProjet;

@UiController("ActeurProjet.edit")
@UiDescriptor("acteur-projet-edit.xml")
@EditedEntityContainer("acteurProjetDc")
public class ActeurProjetEdit extends StandardEditor<ActeurProjet> {
}