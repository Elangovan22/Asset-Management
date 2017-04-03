-- alter table ASSETMANAGEMENT_STATUS add column ASSET_DETAIL_ID varchar(36) ^
-- update ASSETMANAGEMENT_STATUS set ASSET_DETAIL_ID = <default_value> ;
-- alter table ASSETMANAGEMENT_STATUS alter column ASSET_DETAIL_ID set not null ;
alter table ASSETMANAGEMENT_STATUS add column ASSET_DETAIL_ID varchar(36) not null ;
alter table ASSETMANAGEMENT_STATUS drop column ASSET_DETAIL cascade ;
alter table ASSETMANAGEMENT_STATUS drop column STATUS cascade ;
alter table ASSETMANAGEMENT_STATUS add column STATUS integer default 05 not null ;
