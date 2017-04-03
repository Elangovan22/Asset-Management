alter table ASSETMANAGEMENT_NEW__ASSET add column SUPPLIER_ID varchar(36) ;
alter table ASSETMANAGEMENT_NEW__ASSET drop column SUPPLIER cascade ;
