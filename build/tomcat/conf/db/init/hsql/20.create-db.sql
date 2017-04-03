-- begin AMS_NEW_ASSET
alter table AMS_NEW_ASSET add constraint FK_AMS_NEW_ASSET_NAME foreign key (NAME_ID) references AMS_ASSET(ID)^
create unique index IDX_AMS_NEW_ASSET_UNIQ_ASSETID on AMS_NEW_ASSET (ASSETID) ^
create index IDX_AMS_NEW_ASSET_NAME on AMS_NEW_ASSET (NAME_ID)^
-- end AMS_NEW_ASSET
-- begin AMS_NEW_ASSET_SUPLIER_LINK
alter table AMS_NEW_ASSET_SUPLIER_LINK add constraint FK_ANASL_NEW_ASSET foreign key (NEW_ASSET_ID) references AMS_NEW_ASSET(ID)^
alter table AMS_NEW_ASSET_SUPLIER_LINK add constraint FK_ANASL_SUPLIER foreign key (SUPLIER_ID) references AMS_SUPLIER(ID)^
-- end AMS_NEW_ASSET_SUPLIER_LINK
