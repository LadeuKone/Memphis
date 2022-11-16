package com.ascend.memphis.screen.acteur;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Acteur;

@UiController("Acteur.browse")
@UiDescriptor("acteur-browse.xml")
@LookupComponent("acteursTable")
public class ActeurBrowse extends StandardLookup<Acteur> {
}