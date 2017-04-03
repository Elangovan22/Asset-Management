alter table AMS_NEW_ASSET add constraint FK_AMS_NEW_ASSET_NAME foreign key (NAME_ID) references AMS_ASSET(ID);
create unique index IDX_AMS_NEW_ASSET_UNIQ_ASSETID on AMS_NEW_ASSET (ASSETID) ;
create index IDX_AMS_NEW_ASSET_NAME on AMS_NEW_ASSET (NAME_ID);
