package com.ascend.memphis.screen.acteur;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Acteur;

@UiController("Acteur.edit")
@UiDescriptor("acteur-edit.xml")
@EditedEntityContainer("acteurDc")
public class ActeurEdit extends StandardEditor<Acteur> {
}