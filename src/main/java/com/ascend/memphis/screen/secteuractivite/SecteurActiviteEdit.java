package com.ascend.memphis.screen.secteuractivite;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.SecteurActivite;

@UiController("SecteurActivite.edit")
@UiDescriptor("secteur-activite-edit.xml")
@EditedEntityContainer("secteurActiviteDc")
public class SecteurActiviteEdit extends StandardEditor<SecteurActivite> {
}