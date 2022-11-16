package com.ascend.memphis.screen.programme;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Programme;

@UiController("Programme.edit")
@UiDescriptor("programme-edit.xml")
@EditedEntityContainer("programmeDc")
public class ProgrammeEdit extends StandardEditor<Programme> {
}