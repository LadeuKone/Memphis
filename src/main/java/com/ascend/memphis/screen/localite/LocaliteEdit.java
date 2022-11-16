package com.ascend.memphis.screen.localite;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Localite;

@UiController("Localite.edit")
@UiDescriptor("localite-edit.xml")
@EditedEntityContainer("localiteDc")
public class LocaliteEdit extends StandardEditor<Localite> {
}