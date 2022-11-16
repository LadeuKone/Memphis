package com.ascend.memphis.screen.parametredefaut;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.ParametreDefaut;

@UiController("ParametreDefaut.browse")
@UiDescriptor("parametre-defaut-browse.xml")
@LookupComponent("parametreDefautsTable")
public class ParametreDefautBrowse extends StandardLookup<ParametreDefaut> {
}