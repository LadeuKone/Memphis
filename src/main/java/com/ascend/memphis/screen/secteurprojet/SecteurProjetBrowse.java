package com.ascend.memphis.screen.secteurprojet;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.SecteurProjet;

@UiController("SecteurProjet.browse")
@UiDescriptor("secteur-projet-browse.xml")
@LookupComponent("secteurProjetsTable")
public class SecteurProjetBrowse extends StandardLookup<SecteurProjet> {
}