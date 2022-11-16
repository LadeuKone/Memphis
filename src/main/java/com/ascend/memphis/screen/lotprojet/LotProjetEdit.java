package com.ascend.memphis.screen.lotprojet;

import com.ascend.memphis.entity.DetailLot;
import io.jmix.core.DataManager;
import io.jmix.core.EntitySet;
import io.jmix.core.SaveContext;
import io.jmix.ui.Dialogs;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.FileUploadField;
import io.jmix.ui.component.SingleFileUploadField;
import io.jmix.ui.screen.*;
import com.ascend.memphis.entity.LotProjet;
import io.jmix.ui.upload.TemporaryStorage;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@UiController("LotProjet.edit")
@UiDescriptor("lot-projet-edit.xml")
@EditedEntityContainer("lotProjetDc")
public class LotProjetEdit extends StandardEditor<LotProjet> {


    @Autowired
    private DataManager dataManager;
    @Autowired
    private FileUploadField detailLotTableImportDQEBtn;
    @Autowired
    private TemporaryStorage temporaryStorage;



    private boolean importDQE(File dqeFile){
        boolean isOk = false;
        List<DetailLot> dqe = new ArrayList<>();
        EntitySet entitySet = dataManager.save(new SaveContext().saving(dqe));

        return isOk;
    }

    @Subscribe("ImportDQE")
    public void onImportDQEFileUploadSucceed(SingleFileUploadField.FileUploadSucceedEvent event) {

    }
}