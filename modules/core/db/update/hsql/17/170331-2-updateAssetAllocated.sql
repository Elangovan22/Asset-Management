alter table AMS_ASSET_ALLOCATED add column QUANTITY integer ;
alter table AMS_ASSET_ALLOCATED drop column QUANTIY cascade ;
