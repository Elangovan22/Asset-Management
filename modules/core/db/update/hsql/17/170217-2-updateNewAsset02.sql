-- alter table ASSETMANAGEMENT_NEW__ASSET add column ASSET_NAME_ID varchar(36) ^
-- update ASSETMANAGEMENT_NEW__ASSET set ASSET_NAME_ID = <default_value> ;
-- alter table ASSETMANAGEMENT_NEW__ASSET alter column ASSET_NAME_ID set not null ;
alter table ASSETMANAGEMENT_NEW__ASSET add column ASSET_NAME_ID varchar(36) not null ;
alter table ASSETMANAGEMENT_NEW__ASSET drop column ASSET_NAME cascade ;
