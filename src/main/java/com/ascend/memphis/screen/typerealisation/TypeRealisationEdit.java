package com.ascend.memphis.screen.typerealisation;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.TypeRealisation;

@UiController("TypeRealisation.edit")
@UiDescriptor("type-realisation-edit.xml")
@EditedEntityContainer("typeRealisationDc")
public class TypeRealisationEdit extends StandardEditor<TypeRealisation> {
}