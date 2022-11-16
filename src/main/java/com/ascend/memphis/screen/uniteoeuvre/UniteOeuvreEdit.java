package com.ascend.memphis.screen.uniteoeuvre;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.UniteOeuvre;

@UiController("UniteOeuvre.edit")
@UiDescriptor("unite-oeuvre-edit.xml")
@EditedEntityContainer("uniteOeuvreDc")
public class UniteOeuvreEdit extends StandardEditor<UniteOeuvre> {
}