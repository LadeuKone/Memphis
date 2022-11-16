package com.ascend.memphis.screen.departement;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Departement;

@UiController("Departement.browse")
@UiDescriptor("departement-browse.xml")
@LookupComponent("departementsTable")
public class DepartementBrowse extends StandardLookup<Departement> {
}