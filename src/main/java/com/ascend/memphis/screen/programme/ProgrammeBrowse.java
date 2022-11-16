package com.ascend.memphis.screen.programme;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Programme;

@UiController("Programme.browse")
@UiDescriptor("programme-browse.xml")
@LookupComponent("programmesTable")
public class ProgrammeBrowse extends StandardLookup<Programme> {
}