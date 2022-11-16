package com.ascend.memphis.screen.roleacteur;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.RoleActeur;

@UiController("RoleActeur.browse")
@UiDescriptor("role-acteur-browse.xml")
@LookupComponent("roleActeursTable")
public class RoleActeurBrowse extends StandardLookup<RoleActeur> {
}