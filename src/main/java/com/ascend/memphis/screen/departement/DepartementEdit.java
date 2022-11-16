package com.ascend.memphis.screen.departement;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Departement;

@UiController("Departement.edit")
@UiDescriptor("departement-edit.xml")
@EditedEntityContainer("departementDc")
public class DepartementEdit extends StandardEditor<Departement> {
}