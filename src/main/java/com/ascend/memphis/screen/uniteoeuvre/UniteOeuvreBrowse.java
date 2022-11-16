package com.ascend.memphis.screen.uniteoeuvre;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.UniteOeuvre;

@UiController("UniteOeuvre.browse")
@UiDescriptor("unite-oeuvre-browse.xml")
@LookupComponent("uniteOeuvresTable")
public class UniteOeuvreBrowse extends StandardLookup<UniteOeuvre> {
}