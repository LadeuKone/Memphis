package com.ascend.memphis.screen.typerealisation;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.TypeRealisation;

@UiController("TypeRealisation.browse")
@UiDescriptor("type-realisation-browse.xml")
@LookupComponent("typeRealisationsTable")
public class TypeRealisationBrowse extends StandardLookup<TypeRealisation> {
}