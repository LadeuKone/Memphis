package com.ascend.memphis.screen.parametredefaut;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.ParametreDefaut;

@UiController("ParametreDefaut.edit")
@UiDescriptor("parametre-defaut-edit.xml")
@EditedEntityContainer("parametreDefautDc")
public class ParametreDefautEdit extends StandardEditor<ParametreDefaut> {
}