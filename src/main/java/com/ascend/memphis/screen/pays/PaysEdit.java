package com.ascend.memphis.screen.pays;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Pays;

@UiController("Pays.edit")
@UiDescriptor("pays-edit.xml")
@EditedEntityContainer("paysDc")
public class PaysEdit extends StandardEditor<Pays> {
}