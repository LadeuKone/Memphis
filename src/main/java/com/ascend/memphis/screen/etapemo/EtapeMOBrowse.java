package com.ascend.memphis.screen.etapemo;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.EtapeMO;

@UiController("EtapeMO.browse")
@UiDescriptor("etape-mo-browse.xml")
@LookupComponent("etapeMoesTable")
public class EtapeMOBrowse extends StandardLookup<EtapeMO> {
}