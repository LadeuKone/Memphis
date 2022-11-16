package com.ascend.memphis.screen.pays;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Pays;

@UiController("Pays.browse")
@UiDescriptor("pays-browse.xml")
@LookupComponent("paysesTable")
public class PaysBrowse extends StandardLookup<Pays> {
}