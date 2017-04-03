alter table ASSETMANAGEMENT_SUPPLIER add column SUPPLIER__NAME varchar(255) default '' not null ;
alter table ASSETMANAGEMENT_SUPPLIER add column CITY varchar(255) default '' not null ;
alter table ASSETMANAGEMENT_SUPPLIER drop column SUPPLIER cascade ;
alter table ASSETMANAGEMENT_SUPPLIER drop column DISTRICT cascade ;
update ASSETMANAGEMENT_SUPPLIER set STATE = '' where STATE is null ;
alter table ASSETMANAGEMENT_SUPPLIER alter column STATE set not null ;
