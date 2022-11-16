package com.ascend.memphis.screen.region;

import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.Region;

@UiController("Region.browse")
@UiDescriptor("region-browse.xml")
@LookupComponent("regionsTable")
public class RegionBrowse extends StandardLookup<Region> {
}