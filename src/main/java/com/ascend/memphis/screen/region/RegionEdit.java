package com.ascend.memphis.screen.region;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Region;

@UiController("Region.edit")
@UiDescriptor("region-edit.xml")
@EditedEntityContainer("regionDc")
public class RegionEdit extends StandardEditor<Region> {
}