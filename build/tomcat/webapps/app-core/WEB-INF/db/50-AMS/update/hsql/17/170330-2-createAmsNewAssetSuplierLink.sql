alter table AMS_NEW_ASSET_SUPLIER_LINK add constraint FK_ANASL_NEW_ASSET foreign key (NEW_ASSET_ID) references AMS_NEW_ASSET(ID);
alter table AMS_NEW_ASSET_SUPLIER_LINK add constraint FK_ANASL_SUPLIER foreign key (SUPLIER_ID) references AMS_SUPLIER(ID);
