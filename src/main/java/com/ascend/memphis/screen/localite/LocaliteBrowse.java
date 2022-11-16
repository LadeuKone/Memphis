package com.ascend.memphis.screen.localite;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Localite;

@UiController("Localite.browse")
@UiDescriptor("localite-browse.xml")
@LookupComponent("localitesTable")
public class LocaliteBrowse extends StandardLookup<Localite> {
}