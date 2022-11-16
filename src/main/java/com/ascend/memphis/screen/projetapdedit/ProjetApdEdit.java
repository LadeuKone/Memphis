package com.ascend.memphis.screen.projetapdedit;

import com.ascend.memphis.entity.Projet;
import io.jmix.ui.screen.*;

@UiController("ProjetApdEdit")
@UiDescriptor("projet_apd-edit.xml")
@EditedEntityContainer("projetDc")
public class ProjetApdEdit extends StandardEditor<Projet> {
}