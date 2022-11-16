package com.ascend.memphis.screen.roleacteur;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.RoleActeur;

@UiController("RoleActeur.edit")
@UiDescriptor("role-acteur-edit.xml")
@EditedEntityContainer("roleActeurDc")
public class RoleActeurEdit extends StandardEditor<RoleActeur> {
}