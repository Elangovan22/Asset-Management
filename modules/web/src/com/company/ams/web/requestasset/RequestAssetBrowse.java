package com.company.ams.web.requestasset;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import java.util.UUID;
import com.company.ams.entity.Asset;
import com.company.ams.entity.NewAsset;
import com.company.ams.entity.Instance;
import com.company.ams.service.NewService;
import javax.inject.Inject;
import java.util.Collection;
import java.util.Map;

public class RequestAssetBrowse extends AbstractLookup {

@Inject
private NewService instanceService;

@Inject
private CollectionDatasource<Asset, UUID> assetsDs;

@Inject
private CollectionDatasource<NewAsset, UUID> newAssetDs;

@Inject
private CollectionDatasource<Instance, UUID> instancesDs;

@Inject
private LookupPickerField assetField;

@Inject
private Table<Asset> assetsTable;

@Inject
private Table<NewAsset> newAssetsTable;

@Inject
private Table<Instance> instancesTable;

@Inject
private TextField instancesAmountField;

@Inject
private TextField teamviewer;

@Inject
private TextField userid;

@Inject
private Metadata metadata;

@Override
public void init(Map<String, Object> params) {
    assetField.addValueChangeListener(e -> newAssetDs.refresh());
}

public void createAsset() {
    final Window.Editor assetEditor = openEditor(
    "assetmanagement$Asset.edit", metadata.create(Asset.class), WindowManager.OpenType.THIS_TAB
);
assetEditor.addCloseListener(actionId -> {
assetsDs.refresh();
assetField.setValue(assetEditor.getItem());
});
}

public void createcompany() {
Asset asset = assetField.getValue();
if (asset == null) {
showNotification(getMessage("selectAsset.text"), NotificationType.HUMANIZED);
return;
}
NewAsset newasset = metadata.create(NewAsset.class);
newasset.setName(asset);
Window.Editor newassetEditor = openEditor(
"assetmanagement$NewAsset.edit", newasset, WindowManager.OpenType.THIS_TAB
);
newassetEditor.addCloseListener(actionId -> newAssetDs.refresh());
}
 public void createInstances() {
        NewAsset asset = newAssetsTable.getSingleSelected();
      
        if (asset == null) {
            showNotification(getMessage("select company"), NotificationType.HUMANIZED);
           return;
        }

       if (asset.getStatus().toString() != "Deployable") {
            showNotification(getMessage("This asset cant be requested since status is ")+asset.getStatus(), NotificationType.HUMANIZED);
            return;
        }
        Integer instancesAmount = instancesAmountField.getValue();
        Integer team = teamviewer.getValue();
        String user = userid.getValue();
        Asset field = assetField.getValue();
        String vv=field.getInstanceName();
        if (instancesAmount == null || instancesAmount == 0) {
            showNotification(getMessage("setInstancesAmount"), NotificationType.HUMANIZED);
            return;
        }

        if (instancesAmount > 100) {
            showNotification(getMessage("bigInstancesAmount"), NotificationType.HUMANIZED);
            return;
        }
        if(instancesAmount>asset.getAvailablequantity())
        {
              showNotification(getMessage("Enter less quantity "), NotificationType.HUMANIZED);
            return;
        }

       
        Collection<Instance> instances = instanceService.createInstances(
                asset, instancesAmount,vv,team,user);

        
        for (Instance instance : instances) {
            instancesDs.includeItem(instance);
        }
    }
    public void req() {
    
             showNotification(getMessage("Succesfully Requested"), NotificationType.HUMANIZED);
        
}
}