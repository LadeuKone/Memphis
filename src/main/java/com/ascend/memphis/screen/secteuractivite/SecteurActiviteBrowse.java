package com.ascend.memphis.screen.secteuractivite;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.SecteurActivite;

@UiController("SecteurActivite.browse")
@UiDescriptor("secteur-activite-browse.xml")
@LookupComponent("secteurActivitesTable")
public class SecteurActiviteBrowse extends StandardLookup<SecteurActivite> {
}